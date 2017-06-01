package com.jpgarcia.command;

import java.util.List;

import com.jpgarcia.app.Persona;

public interface PersonaCommand {
	
	public void crearPersona(Persona persona);
	
	public Persona consultarPersona(Persona persona);
	
	public List<Persona> listarpersona();
	
	public void borrarPersona(Persona persona);
	
	public void actualizarPersona(Persona persona);
	
	
}
