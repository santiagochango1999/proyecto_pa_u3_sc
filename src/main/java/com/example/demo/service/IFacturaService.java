package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.ProductoLista;

public interface IFacturaService {

	public void realizarFactura(List<ProductoLista> lista,String cedula,String numero);
}
