package com.example.demo.service;

public interface IHotelService {
	
	public int eliminarPorNombre(String nombre);
	public int eliminarPorDireccion(String direccion);
	
	public int actualizarPorNombre(String nombre,String direccion);
	public int actualizarPorDireccion(String direccion,String nombre);

}
