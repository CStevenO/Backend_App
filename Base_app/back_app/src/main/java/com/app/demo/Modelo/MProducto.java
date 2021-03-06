package com.app.demo.Modelo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="productos")
public class MProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	@Column(unique = true, nullable = false)
	private String codigo;
	private String nombre;
	private String foto;
	public MProducto() {
	}
	public MProducto(Long id) {
		this.id = id;
	}
	public MProducto(Long id, String codigo, String nombre, String foto) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.foto = foto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "MProducto [id=" + id + ", codigo=" + codigo + ", nombre=" + nombre + ", foto=" + foto + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, foto, id, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MProducto other = (MProducto) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(foto, other.foto) && Objects.equals(id, other.id)
				&& Objects.equals(nombre, other.nombre);
	}
	
}
