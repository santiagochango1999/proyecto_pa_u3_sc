package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IHabitacionRepository;


@Service
public class HabitacionServiceImpl implements IHabitacionService {

	@Autowired
	private IHabitacionRepository habitacionRepository;
	@Override
	public List<Habitacion> buscarHotelOtherRightJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepository.buscarHotelOtherRightJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOtherLengtJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepository.buscarHotelOtherLengtJoin();
	}

	@Override
	public List<Habitacion> buscarHotelOtherFullJoin() {
		// TODO Auto-generated method stub
		return this.habitacionRepository.buscarHotelOtherFullJoin();
	}


	
	

}
