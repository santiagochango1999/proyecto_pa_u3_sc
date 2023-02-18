package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Detalle;
import com.example.demo.modelo.Factura;
import com.example.demo.modelo.Item;
import com.example.demo.modelo.ProductoLista;
import com.example.demo.repository.IFacturaRepo;

@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepo facturaRepo;
	@Autowired
	private IItemService iItemService;
	@Autowired
	private IDetalleService iDetalleService;

	@Override
	public void realizarFactura(List<ProductoLista> lista, String cedula, String numero) {
		// TODO Auto-generated method stub

		Factura factura=new Factura();
		factura.setCedula(cedula);
		factura.setFecha(LocalDateTime.now());
		factura.setNumero(numero);
		
		this.facturaRepo.ingresar(factura);
		
		Detalle detalle=new Detalle();
		Item item=new Item();

		List<Detalle> d=new ArrayList<>();
		BigDecimal valortotal;
		for(ProductoLista listar:lista) {
			
			item=this.iItemService.validacion(listar.getCodigoBarra());
			if(listar.getCantidad()>=item.getStock()) {
				
				listar.setCantidad(item.getStock());
				item.setStock(0);
				this.iItemService.modificar(item);
				
				detalle.setCantidad(listar.getCantidad());
				detalle.setPrecioUnitario(item.getPrecio());
				detalle.setSubtotal(null);
				
				
				
			}else {
				item.setStock(item.getStock()-listar.getCantidad());
				this.iItemService.modificar(item);

				detalle.setCantidad(listar.getCantidad());
				detalle.setPrecioUnitario(item.getPrecio());
				detalle.setSubtotal(null);
			}
			detalle.setFactura(factura);
			detalle.setItem(item);
			d.add(detalle);
		}
		
		this.iDetalleService.crear(detalle);
		item.setDetalle(d);
		
		this.iItemService.modificar(item);
		
		factura.setDetalle(d);
		this.facturaRepo.modificar(factura);
		
	}

}
