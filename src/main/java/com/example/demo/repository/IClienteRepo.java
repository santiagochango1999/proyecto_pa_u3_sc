package com.example.demo.repository;

import com.example.demo.modelo.Cliente;

public interface IClienteRepo {
	public void insertar(Cliente cliente);

	public void actulizar(Cliente cliente);

	public Cliente buscar(Integer id);

	public Cliente buscarPorCedula(String cedula);

	public void borrar(Integer id);
}
