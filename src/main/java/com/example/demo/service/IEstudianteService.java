package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {

	public Estudiante modificarPorNombre(String nombre);
	public Estudiante modificarPorApellido(String apellido);
	public void insertar(Estudiante estudiante);

}
