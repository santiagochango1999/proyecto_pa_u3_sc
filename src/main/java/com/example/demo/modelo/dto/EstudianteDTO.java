package com.example.demo.modelo.dto;



public class EstudianteDTO {

	private String nombre;
	private String apellido;
	private String genero;
	private String cedula;
	
	public EstudianteDTO() {
	}
	
	public EstudianteDTO(String nombre, String apellido, String genero, String cedula) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.cedula = cedula;
	}

	
	
	//GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	

}
