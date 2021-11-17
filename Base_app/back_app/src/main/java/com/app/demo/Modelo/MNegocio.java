package com.app.demo.Modelo;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="negocios")
public class MNegocio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String nombre;
	private String direccion;
	private String geolocalizacion;
	private String telefono;
	private String celular;
	private String pagina_web;
	private String logo;
	private String foto;
	//TODO: Agregar el tipo de negocio
	public MNegocio() {
	}
	public MNegocio(Long id) {
		this.id = id;
	}
	public MNegocio(Long id, String nombre, String direccion, String geolocalizacion, String telefono, String celular,
			String pagina_web, String logo, String foto) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.geolocalizacion = geolocalizacion;
		this.telefono = telefono;
		this.celular = celular;
		this.pagina_web = pagina_web;
		this.logo = logo;
		this.foto = foto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getGeolocalizacion() {
		return geolocalizacion;
	}
	public void setGeolocalizacion(String geolocalizacion) {
		this.geolocalizacion = geolocalizacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getPagina_web() {
		return pagina_web;
	}
	public void setPagina_web(String pagina_web) {
		this.pagina_web = pagina_web;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	@Override
	public String toString() {
		return "MNegocio [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", geolocalizacion="
				+ geolocalizacion + ", telefono=" + telefono + ", celular=" + celular + ", pagina_web=" + pagina_web
				+ ", logo=" + logo + ", foto=" + foto + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(celular, direccion, foto, geolocalizacion, id, logo, nombre, pagina_web,
				telefono);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MNegocio other = (MNegocio) obj;
		return Objects.equals(celular, other.celular) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(foto, other.foto) && Objects.equals(geolocalizacion, other.geolocalizacion)
				&& Objects.equals(id, other.id) && Objects.equals(logo, other.logo)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(pagina_web, other.pagina_web)
				&& Objects.equals(telefono, other.telefono);
	}
	
}
