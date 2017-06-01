package com.jpgarcia.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Domicilios {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPersona;
	private String nomPersona;
	private String apePersona;
	@OneToMany( targetEntity=Direcciones.class )
	private Direcciones direccionn;

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNomPersona() {
		return nomPersona;
	}

	public void setNomPersona(String nomPersona) {
		this.nomPersona = nomPersona;
	}

	public String getApePersona() {
		return apePersona;
	}

	public void setApePersona(String apePersona) {
		this.apePersona = apePersona;
	}

	public Direcciones getDireccionn() {
		return direccionn;
	}

	public void setDireccionn(Direcciones direccionn) {
		this.direccionn = direccionn;
	}

}
