package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")

@NamedQuery(name = "Automovil.buscarPorPlaca", 
query = "select a from Automovil a where a.placa=:datoPlaca")
@NamedNativeQuery(name = "Automovil.buscarPorPlaca1", 
query = "select * from automovil where auto_placa=:datoPlaca",resultClass = Automovil.class)
//Color
@NamedQuery(name = "Automovil.buscarPorColor",
query = "select a from Automovil a where a.color=:datoColor")
@NamedNativeQuery(name = "Automovil.buscarPorColor1", 
query = "select * from automovil a where auto_color=:datoColor",resultClass = Automovil.class)
//Marca
@NamedQuery(name = "Automovil.buscarPorMarca", 
query = "select a from Automovil a where a.marca=:datoMarca")
@NamedNativeQuery(name = "Automovil.buscarPorMarca1", 
query = "select * from automovil where auto_marca=:datoMarca",resultClass = Automovil.class)
public class Automovil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "auto_seq")
	@SequenceGenerator(name = "auto_seq",sequenceName = "auto_seq",allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;
	@Column(name = "auto_placa")
	private String placa;
	@Column(name = "auto_marca")
	private String marca;
	@Column(name = "auto_numero_puertas")
	private String numeroPuertas;
	@Column(name = "auto_valor")
	private BigDecimal valor;
	@Column(name = "auto_año")
	private String año;
	@Column(name = "auto_nombre_dueño")
	private String nombreDueño;
	@Column(name = "auto_color")
	private String color;
	
	
	//GET Y SET
	
	public Integer getId() {
		return id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getAño() {
		return año;
	}
	public void setAño(String año) {
		this.año = año;
	}
	public String getNombreDueño() {
		return nombreDueño;
	}
	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	
	
	

}
