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
@Table(name="Ventas")
public class MVentas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	@JoinColumn(name = "id_cliente",nullable=false)
	@ManyToOne(optional = false)
	private MCliente cliente;
	private double total;
	public MVentas() {
	}
	public MVentas(MCliente cliente, double total) {
		this.cliente = cliente;
		this.total = total;
	}
	public MVentas(Long id, MCliente cliente, double total) {
		this.id = id;
		this.cliente = cliente;
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MCliente getCliente() {
		return cliente;
	}
	public void setCliente(MCliente cliente) {
		this.cliente = cliente;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "MVentas [id=" + id + ", cliente=" + cliente + ", total=" + total + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cliente, id, total);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MVentas other = (MVentas) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(id, other.id)
				&& Double.doubleToLongBits(total) == Double.doubleToLongBits(other.total);
	}
	
}
