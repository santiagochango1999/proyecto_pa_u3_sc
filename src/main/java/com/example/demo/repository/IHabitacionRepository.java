package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Habitacion;

public interface IHabitacionRepository {

	public List<Habitacion> buscarHotelOtherRightJoin( );
	public List<Habitacion> buscarHotelOtherLengtJoin( );
	public List<Habitacion> buscarHotelOtherFullJoin( );
}
