package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImp implements IEstudianteService {

	@Autowired
	private IEstudianteRepo iEstudianteRepo;
	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQuery(nombre);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorApellidoQuery(apellido);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepo.insertar(estudiante);
	}

	@Override
	public Estudiante buscarPorGeneroQuery(String genero) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorGeneroQuery(genero);
	}

	@Override
	public Estudiante buscarPorCedulaQuery(String cedula) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorCedulaQuery(cedula);
	}

	@Override
	public Estudiante buscarPorCiudadQuery(String ciudad) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorCiudadQuery(ciudad);
	}

}
