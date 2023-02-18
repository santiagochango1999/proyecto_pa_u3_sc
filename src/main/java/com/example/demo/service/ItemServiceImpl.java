package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Item;
import com.example.demo.repository.IItemRepo;

@Service
public class ItemServiceImpl implements IItemService {

	@Autowired
	private IItemRepo iItemRepo;

	@Override
	public void crear(Item item) {

		// TODO Auto-generated method stub
		Item i = this.validacion(item.getCodigoBarras());
		
		if (i == null) {
			this.iItemRepo.insertar(item);
		} else {
			i.setStock(i.getStock() + item.getStock());
			this.modificar(i);
		}
	}

	@Override
	public Item validacion(String codigoBarra) {
		// TODO Auto-generated method stub
		return this.iItemRepo.validacion(codigoBarra);
	}

	@Override
	public void modificar(Item item) {
		// TODO Auto-generated method stub
		this.iItemRepo.actualizar(item);
	}

}
