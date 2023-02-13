package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IHotelRepository;

import jakarta.persistence.EntityManager;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	private IHotelRepository hotelRepository;
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

}
