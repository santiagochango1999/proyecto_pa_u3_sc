package com.example.demo.repository;

import com.example.demo.modelo.Item;

public interface IItemRepo {
	public void insertar(Item item);

	public Item validacion(String codigoBarra);

	public void actualizar(Item item);

}
