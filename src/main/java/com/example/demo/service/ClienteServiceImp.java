package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteServiceImp implements IClienteService {

	@Autowired
	private IClienteRepo iClienteRepo;

	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepo.insertar(cliente);
	}

	@Override
	public void modificar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepo.actulizar(cliente);
	}

	@Override
	public Cliente encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iClienteRepo.borrar(id);
	}

	@Override
	public Cliente encontrarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscarPorCedula(cedula);
	}

}
