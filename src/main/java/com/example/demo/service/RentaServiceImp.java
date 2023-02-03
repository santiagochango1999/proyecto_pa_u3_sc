package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IRentaRepo;

@Service
public class RentaServiceImp implements IRentaService {

	@Autowired
	private IVehiculoService iVehiculoService;

	@Autowired
	private IClienteService iClienteService;

	@Autowired
	private IRentaRepo iRentaRepo;

	@Override
	public Renta realizarRenta(String cedula, String placa) {
		// TODO Auto-generated method stub
		

		Vehiculo vehiculo=this.iVehiculoService.encontrarPorPlaca(placa);
		Cliente cliente=this.iClienteService.encontrarPorCedula(cedula);
		
		Renta renta=new Renta();
		renta.setCliente(cliente);
		renta.setVehiculo(vehiculo);
		
		this.iRentaRepo.insertar(renta);
		
		return renta;
		
	}

}
