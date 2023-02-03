package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_sec")
	@SequenceGenerator(name = "vehi_sec", sequenceName = "vehi_sec", allocationSize = 1)
	@Column(name="vehi_id")
	private Integer id;
	@Column(name="vehi_precio_dia")
	private BigDecimal precioDia;
	@Column(name="vehi_placa")
	private String placa;
	@Column(name="vehi_categoria")
	private String categoria;
	@Column(name="vehi_numero_series")
	private String numeroSerie;
	
	@OneToMany(mappedBy = "vehiculo",cascade = CascadeType.ALL )
	private List<Renta> renta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(BigDecimal precioDia) {
		this.precioDia = precioDia;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	

	public List<Renta> getRenta() {
		return renta;
	}

	public void setRenta(List<Renta> renta) {
		this.renta = renta;
	}

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", precioDia=" + precioDia + ", marca=" + placa + ", categoria=" + categoria
				+ ", numeroSerie=" + numeroSerie + "]";
	}
}
