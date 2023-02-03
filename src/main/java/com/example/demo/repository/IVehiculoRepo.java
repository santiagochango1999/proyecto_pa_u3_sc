package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public Vehiculo buscar(Integer id);
	
	public Vehiculo buscarPorPlaca(String placa);

	public void borrar(Integer id);
}
