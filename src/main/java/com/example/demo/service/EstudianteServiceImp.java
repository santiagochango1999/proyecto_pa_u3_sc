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
	public Estudiante modificarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorNombreQuery(nombre);
	}

	@Override
	public Estudiante modificarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.iEstudianteRepo.buscarPorApellidoQuery(apellido);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.iEstudianteRepo.insertar(estudiante);
	}

}
