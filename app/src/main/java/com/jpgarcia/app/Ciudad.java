package com.jpgarcia.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Ciudad {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO) 
   private int    idCiudad ;
   private String nomCiudad;
   
   public int getIdCiudad() {
      return idCiudad;
   }
   public void setIdCiudad(int idCiudad) {
      this.idCiudad = idCiudad;
   }
   public String getNomCiudad() {
      return nomCiudad;
   }
   public void setNomCiudad(String nomCiudad) {
      this.nomCiudad = nomCiudad;
   }

}
