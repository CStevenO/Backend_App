package com.app.demo.Modelo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_negocio")
public class MTipoNegocio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String tipo;
	private String foto;
	public MTipoNegocio() {
	}
	public MTipoNegocio(Long id, String tipo, String foto) {
		this.id = id;
		this.tipo = tipo;
		this.foto = foto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "MTipoNegocio [id=" + id + ", tipo=" + tipo + ", foto=" + foto + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(foto, id, tipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MTipoNegocio other = (MTipoNegocio) obj;
		return Objects.equals(foto, other.foto) && Objects.equals(id, other.id) && Objects.equals(tipo, other.tipo);
	}
	
}
