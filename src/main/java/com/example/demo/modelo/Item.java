package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ite_seq")
	@SequenceGenerator(name = "ite_seq", sequenceName = "ite_seq", allocationSize = 1)
	@Column(name = "ite_id")
	private String id;
	@Column(name = "ite_codigo_barra")
	private String codigoBarras;
	@Column(name = "ite_nombre")
	private String nombre;
	@Column(name = "ite_tipo")
	private String tipo;
	@Column(name = "ite_stock")
	private Integer stock;
	@Column(name = "ite_precio")
	private BigDecimal precio;
	
	@OneToMany(mappedBy = "item")
	private List<Detalle> detalle;

	
	
	
	public List<Detalle> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<Detalle> detalle) {
		this.detalle = detalle;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	
	
}
