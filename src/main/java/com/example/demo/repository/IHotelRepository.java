package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelRepository {

	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	
	public int eliminarPorNombre(String nombre);
	public int eliminarPorDireccion(String direccion);
	
	public int actualizarPorNombre(String nombre,String direccion);
	public int actualizarPorDireccion(String direccion,String nombre);

	
}
