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
@Table(name="detalle_ventas")
public class MDetalle_Ventas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_venta",nullable=false)
	private MVentas venta;
	@ManyToOne(optional = false)
	@JoinColumn(name = "productoNegocio",nullable=false)
	private MProductoNegocio producto;
	private int cantidad;
	public MDetalle_Ventas() {
	}
	public MDetalle_Ventas(Long id, MProductoNegocio producto, int cantidad) {
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public MDetalle_Ventas(Long id, MVentas venta, MProductoNegocio producto, int cantidad) {
		this.id = id;
		this.venta = venta;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MVentas getVenta() {
		return venta;
	}
	public void setVenta(MVentas venta) {
		this.venta = venta;
	}
	public MProductoNegocio getProducto() {
		return producto;
	}
	public void setProducto(MProductoNegocio producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "MDetalle_Ventas [id=" + id + ", venta=" + venta + ", producto=" + producto + ", cantidad=" + cantidad
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cantidad, id, producto, venta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MDetalle_Ventas other = (MDetalle_Ventas) obj;
		return cantidad == other.cantidad && Objects.equals(id, other.id) && Objects.equals(producto, other.producto)
				&& Objects.equals(venta, other.venta);
	}
	
	
}
