package com.jpgarcia.command;

import java.util.List;

import com.jpgarcia.app.Ciudad;

public interface CiudadCommand {
	
	public void crearCiudad(Ciudad ciudad);
	
	public Ciudad ConsultarCiudad(Ciudad ciudad);
	
	public void borrarCiudad(Ciudad ciudad);
	
	public void actualizarCiudad (Ciudad ciudad);
	
	public List<Ciudad> listarCiudades();
	

}
