package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelService {
	
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOtherRightJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOtherLengtJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelOtherFullJoin(String tipoHabitacion);
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion);

	
	
	
	
	
	
	public int eliminarPorNombre(String nombre);
	public int eliminarPorDireccion(String direccion);
	
	public int actualizarPorNombre(String nombre,String direccion);
	public int actualizarPorDireccion(String direccion,String nombre);

}
