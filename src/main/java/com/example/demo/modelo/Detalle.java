package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "deta_seq")
	@SequenceGenerator(name = "deta_seq", sequenceName = "deta_seq", allocationSize = 1)
	@Column(name = "deta_id")
	private String id;
	@Column(name = "deta_cantidad")
	private Integer cantidad;
	@Column(name = "deta_precio_unitario")
	private BigDecimal precioUnitario;
	@Column(name = "deta_subtotal")
	private BigDecimal subtotal;
	
	@ManyToOne
	@JoinColumn(name = "deta_id_item")
	private Item item;
	
	@ManyToOne
	@JoinColumn(name = "deta_id_factura")
	private Factura factura;
	
	
	
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
}
