package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {
	public void agregar(Vehiculo vehiculo);

	public void modificar(Vehiculo vehiculo);

	public Vehiculo encontrar(Integer id);
	
	public Vehiculo encontrarPorPlaca(String placa);


	public void borrar(Integer id);
}
