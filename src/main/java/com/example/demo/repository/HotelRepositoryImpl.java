package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepositoryImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int eliminarPorNombre(String nombre) {
		Query query = this.entityManager.createQuery("DELETE FROM Hotel h WHERE h.nombre=:nombre");
		query.setParameter("nombre", nombre);
		
		return query.executeUpdate();
	}

	@Override
	public int eliminarPorDireccion(String direccion) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createQuery("DELETE FROM Hotel h WHERE h.direccion=:direccion");
		query.setParameter("direccion", direccion);
		
		return query.executeUpdate();
	}

	@Override
	public int actualizarPorNombre(String nombre, String direccion) {
		// TODO Auto-generated method stub
		Query query=this.entityManager.createQuery("UPDATE Hotel h SET h.nombre= :datoNombre WHERE h.direccion= :datoDireccion");
		query.setParameter("datoNombre", nombre);
		query.setParameter("datoDireccion", direccion);
		
		return query.executeUpdate();
	}

	@Override
	public int actualizarPorDireccion(String direccion, String nombre) {
		// TODO Auto-generated method stub
		Query query=this.entityManager.createQuery("UPDATE Hotel h SET h.direccion= :datoDireccion WHERE h.nombre= :datoNombre");
		query.setParameter("datoNombre", nombre);
		query.setParameter("datoDireccion", direccion);
		
		return query.executeUpdate();
	}

}
