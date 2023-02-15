package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionService {

	public List<Habitacion> buscarHotelOtherRightJoin( );
	public List<Habitacion> buscarHotelOtherLengtJoin( );
	public List<Habitacion> buscarHotelOtherFullJoin( );
}
