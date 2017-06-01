package com.jpgarcia.dao;

import java.util.List;

import com.jpgarcia.app.Persona;

public interface PersonaDao   {
	
	
	public void crearPersona(Persona persona);
	
	public Persona consultarPersona(Persona persona);
	
	public List<Persona> listarPersonas();
	
	public void borrarPersona (Persona persona);
	
	public void actualizarPersona(Persona persona);

}
