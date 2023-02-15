package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IHotelRepository;

import jakarta.persistence.EntityManager;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;
	
	
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelInnerJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOtherRightJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOtherRightJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOtherLengtJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOtherLengtJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelOtherFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOtherFullJoin(tipoHabitacion);
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelFetchJoin(tipoHabitacion);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public int eliminarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.hotelRepository.eliminarPorNombre(nombre);
	}

	@Override
	public int eliminarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.eliminarPorDireccion(direccion);
	}

	@Override
	public int actualizarPorNombre(String nombre, String direccion) {
		// TODO Auto-generated method stub
		return this.hotelRepository.actualizarPorNombre(nombre, direccion);
	}

	@Override
	public int actualizarPorDireccion(String direccion, String nombre) {
		// TODO Auto-generated method stub
		return this.hotelRepository.actualizarPorDireccion(direccion, nombre);
	}

	
	
	
	@Override
	public List<Hotel> buscarHotelOtherRightJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOtherRightJoin();
	}

	@Override
	public List<Hotel> buscarHotelOtherLengtJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOtherLengtJoin();
	}

	@Override
	public List<Hotel> buscarHotelOtherFullJoin() {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotelOtherFullJoin();
	}

	
	
}
