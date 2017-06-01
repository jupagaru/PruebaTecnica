package com.jpgarcia.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Direcciones {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO) 
	private int idDireccion;
	private String nomDireccion;
	private Ciudad ciudad;

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getNomDireccion() {
		return nomDireccion;
	}

	public void setNomDireccion(String nomDireccion) {
		this.nomDireccion = nomDireccion;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
}
