package com.jpgarcia.dao;

import java.util.List;

import com.jpgarcia.app.Domicilios;

public interface DomicilioDao {
	
	public void  crearDomicilio (Domicilios domicilio);
	
	public Domicilios consultarDomicilios(Domicilios domicilio);
		
	public List <Domicilios> listarDomicilios();
	
	public void borrarDomicilio(Domicilios domicilio);
	
	public void updateDomicilio(Domicilios domicilio);
	

}
