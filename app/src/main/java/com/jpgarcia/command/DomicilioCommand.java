package com.jpgarcia.command;

import java.util.List;

import com.jpgarcia.app.Domicilios;

public interface DomicilioCommand {
	
	
	public void crearDomiciliio(Domicilios domicilio);
	
	public Domicilios consultarDomicilio(Domicilios domicilio);
	
	public void borrarDomicilio(Domicilios domicilio);
	
	public void actualizarDomicilio(Domicilios domicilio);
	
	public List<Domicilios>listarDomicilios();
	
	

}
