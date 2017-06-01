package com.jpgarcia.command;

import java.util.List;

import com.jpgarcia.app.Direcciones;

public interface DireccionCommand{
	
	
	public void  guardarDireccion(Direcciones direccion);
	
	public Direcciones ConsultarDireccion(Direcciones direccion);
	
	public List<Direcciones> listarDirecciones();
	
	public void borrarDireccion(Direcciones direccion);
	
	public void actualizarDireccion(Direcciones direccion);


	
}
