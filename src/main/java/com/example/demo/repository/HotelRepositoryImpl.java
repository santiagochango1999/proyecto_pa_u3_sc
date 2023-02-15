package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Habitacion;
import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class HotelRepositoryImpl implements IHotelRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Hotel> buscarHotelInnerJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		// SELECT h.hote_nombre, ha.habi_numero FROM hotel h INNER JOIN habitacion ha on
		// h.hote_id=ha.habi_id_hotel
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h INNER JOIN h.habitacion  ha WHERE ha.tipo = :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);

		// Bajo demanda
		List<Hotel> listaHoteles = myQuery.getResultList();
		for (Hotel hotel : listaHoteles) {

			// traer solamente si
			List<Habitacion> listTemp = new ArrayList<>();
			for (Habitacion ha : hotel.getHabitacion()) {
				if (ha.getTipo().equals(tipoHabitacion))
					listTemp.add(ha);
			}

			hotel.getHabitacion().size();
			hotel.setHabitacion(listTemp);

		}
		return listaHoteles;

	}

	@Override
	public List<Hotel> buscarHotelOtherRightJoin(String tipoHabitacion) {
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h RIGHT JOIN h.habitacion  ha WHERE ha.tipo = :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);

//		List<Hotel> listaHoteles=myQuery.getResultList();
//		for(Hotel h:listaHoteles) {
//			h.getHabitacion().size();
//		}
//		
		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOtherLengtJoin(String tipoHabitacion) {

		TypedQuery<Hotel> myQuery = this.entityManager
				.createQuery("SELECT h FROM Hotel h LEFT JOIN h.habitacion  ha WHERE ha.tipo = :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);

		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOtherFullJoin(String tipoHabitacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> buscarHotelFetchJoin(String tipoHabitacion) {

		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h JOIN FETCH h.habitacion  ha WHERE ha.tipo = :datoTipo", Hotel.class);
		myQuery.setParameter("datoTipo", tipoHabitacion);
		
		// Bajo demanda
		
		List<Hotel> listaHoteles = myQuery.getResultList();
		for (Hotel hotel : listaHoteles) {

			hotel.getHabitacion().size();

		}
		return listaHoteles;
	}

	@Override
	public List<Hotel> buscarHotelOtherRightJoin() {

		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h RIGHT JOIN h.habitacion  ha ", Hotel.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOtherLengtJoin() {

		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h  LEFT JOIN h.habitacion  ha ", Hotel.class);

		return myQuery.getResultList();
	}

	@Override
	public List<Hotel> buscarHotelOtherFullJoin() {
		// TODO Auto-generated method stub
		return null;
	}

	// -----------------------------------------------------------
	// DEBER
	// -----------------------------------------------------------
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
		Query query = this.entityManager
				.createQuery("UPDATE Hotel h SET h.nombre= :datoNombre WHERE h.direccion= :datoDireccion");
		query.setParameter("datoNombre", nombre);
		query.setParameter("datoDireccion", direccion);

		return query.executeUpdate();
	}

	@Override
	public int actualizarPorDireccion(String direccion, String nombre) {
		// TODO Auto-generated method stub
		Query query = this.entityManager
				.createQuery("UPDATE Hotel h SET h.direccion= :datoDireccion WHERE h.nombre= :datoNombre");
		query.setParameter("datoNombre", nombre);
		query.setParameter("datoDireccion", direccion);

		return query.executeUpdate();
	}

}
