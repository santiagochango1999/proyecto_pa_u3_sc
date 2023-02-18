package com.example.demo.repository;

import com.example.demo.modelo.Factura;

public interface IFacturaRepo {

	public void ingresar(Factura factura);
	public void modificar(Factura factura);
}
