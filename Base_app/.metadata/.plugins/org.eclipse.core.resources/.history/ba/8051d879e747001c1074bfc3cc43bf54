package com.app.demo.Modelo;

import java.util.List;
import java.util.Objects;

public class VentasyDetalles {
	MVentas ventas;
	List<MDetalle_Ventas> detalles;
	public VentasyDetalles() {
	}
	public VentasyDetalles(MVentas ventas, List<MDetalle_Ventas> detalles) {
		this.ventas = ventas;
		this.detalles = detalles;
	}
	public MVentas getVentas() {
		return ventas;
	}
	public void setVentas(MVentas ventas) {
		this.ventas = ventas;
	}
	public List<MDetalle_Ventas> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<MDetalle_Ventas> detalles) {
		this.detalles = detalles;
	}
	@Override
	public String toString() {
		return "VentasyDetalles [ventas=" + ventas + ", detalles=" + detalles + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(detalles, ventas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VentasyDetalles other = (VentasyDetalles) obj;
		return Objects.equals(detalles, other.detalles) && Objects.equals(ventas, other.ventas);
	}
	
}
