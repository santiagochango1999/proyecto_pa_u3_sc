package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteService {

	public Estudiante buscarPorNombre(String nombre);
	public Estudiante buscarPorApellido(String apellido);
	public Estudiante buscarPorGeneroQuery(String genero);
	public Estudiante buscarPorCedulaQuery(String cedula);
	public Estudiante buscarPorCiudadQuery(String ciudad);
	
	public Estudiante buscarPorNombreTypeQuery(String nombre);
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	public Estudiante buscarPorNombreNamedQueryTyped(String nombre);

	public Estudiante buscarPorNombreNativeQuery(String nombre);
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre);
	
	public void insertar(Estudiante estudiante);

	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNamedQueryList(String nombre);
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre);

	public EstudianteDTO buscarPorNombreNamedQueryTypedDTO(String nombre);


	public EstudianteDTO buscarPorNombreTypedQueryDTO(String nombre);
	public Estudiante buscarPorNombreQueryTypedCriteria(String nombre); 

	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String bandera);

	//
	public int eliminarPorApellido(String apellido);
	public int actualizarPorApellido(String apellido,String nombre);
}
