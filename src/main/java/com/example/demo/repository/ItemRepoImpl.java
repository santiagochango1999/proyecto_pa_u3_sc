package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ItemRepoImpl implements IItemRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.persist(item);
	}

	@Override
	public Item validacion(String codigoBarra) {
		// TODO Auto-generated method stub
		Query query = this.entityManager.createNativeQuery("select * from item where ite_codigo_barra= :datoItem",
				Item.class);
		query.setParameter("datoItem", codigoBarra);
		return (Item) query.getSingleResult();
	}

	@Override
	public void actualizar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.merge(item);
	}

}
