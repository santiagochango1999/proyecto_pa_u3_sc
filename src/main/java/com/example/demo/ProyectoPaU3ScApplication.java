package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3ScApplication implements CommandLineRunner{

	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estudiante =new Estudiante();
		estudiante.setApellido("chango");
		estudiante.setCedula("1544561");
		estudiante.setCiudad("quito");
		estudiante.setFechaNacimiento(LocalDateTime.now());
		estudiante.setGenero("m");
		estudiante.setHobby("luchar");
		estudiante.setNombre("santiag");
		estudiante.setPais("ecuador");
		estudiante.setSalario(new BigDecimal(0));
		//this.estudianteService.insertar(estudiante);
		System.out.println("BUSCAR POR APELLIDO");
		System.out.println(this.estudianteService.buscarPorApellido("chango"));
		System.out.println("BUSCAR POR GENERO");
		System.out.println(this.estudianteService.buscarPorGeneroQuery("m"));
		System.out.println("BUSCAR POR CEDULA");
		System.out.println(this.estudianteService.buscarPorCedulaQuery("1544561"));
		System.out.println("BUSCAR POR CIUDAD");
		System.out.println(this.estudianteService.buscarPorCiudadQuery("quito"));

	}

}
