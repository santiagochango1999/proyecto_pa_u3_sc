package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class HabitacionRepositoryImpl implements IHabitacionRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public List<Habitacion> buscarHotelOtherRightJoin() {
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery(
				"SELECT ha FROM Hotel h  RIGHT JOIN h.habitacion  ha ", Habitacion.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Habitacion> buscarHotelOtherLengtJoin() {
		TypedQuery<Habitacion> myQuery = this.entityManager.createQuery(
				"SELECT ha FROM Hotel h  LEFT JOIN h.habitacion  ha ", Habitacion.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Habitacion> buscarHotelOtherFullJoin() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
