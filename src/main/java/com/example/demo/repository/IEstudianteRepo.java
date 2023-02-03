package com.example.demo.repository;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteRepo {

	public Estudiante buscarPorNombreQuery(String nombre);
	public Estudiante buscarPorApellidoQuery(String apellido);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	public void insertar(Estudiante estudiante);
}
