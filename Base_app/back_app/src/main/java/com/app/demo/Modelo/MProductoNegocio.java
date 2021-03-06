package com.app.demo.Modelo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="producto_negocio")
public class MProductoNegocio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_producto",nullable=false)
	private MProducto producto;
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_negocio",nullable=false)
	private MNegocio negocio;
	private Float precio;
	public MProductoNegocio() {
	}
	public MProductoNegocio(Long id, MProducto producto, MNegocio negocio, Float precio) {
		this.id = id;
		this.producto = producto;
		this.negocio = negocio;
		this.precio = precio;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MProducto getProducto() {
		return producto;
	}
	public void setProducto(MProducto producto) {
		this.producto = producto;
	}
	public MNegocio getNegocio() {
		return negocio;
	}
	public void setNegocio(MNegocio negocio) {
		this.negocio = negocio;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "ProductoNegocio [id=" + id + ", producto=" + producto + ", negocio=" + negocio + ", precio=" + precio
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, negocio, precio, producto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MProductoNegocio other = (MProductoNegocio) obj;
		return Objects.equals(id, other.id) && Objects.equals(negocio, other.negocio)
				&& Objects.equals(precio, other.precio) && Objects.equals(producto, other.producto);
	}
	
}
