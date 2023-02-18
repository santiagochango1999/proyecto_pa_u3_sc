package com.example.demo.service;

import com.example.demo.modelo.Item;

public interface IItemService {

	public void crear(Item item);

	public Item validacion(String codigoBarra);

	public void modificar(Item item);
}
