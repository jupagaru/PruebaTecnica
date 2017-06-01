package com.jpgarcia.command.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpgarcia.app.Direcciones;
import com.jpgarcia.app.Persona;
import com.jpgarcia.command.PersonaCommand;
import com.jpgarcia.dao.DireccionDao;
import com.jpgarcia.dao.PersonaDao;

public class PersonaCommandImpl implements PersonaCommand {

	@Autowired
	PersonaDao personaDao;
	@Autowired 
	DireccionDao direccion;

	@Override
	public void crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		personaDao.crearPersona(persona);
		direccion.guardarDireccion(persona.getDireccion());
	}

	@Override
	public Persona consultarPersona(Persona persona) {
		// TODO Auto-generated method stub

		return personaDao.consultarPersona(persona);

	}

	@Override
	public List<Persona> listarpersona() {
		// TODO Auto-generated method stub
		return personaDao.listarPersonas();
	}

	@Override
	public void borrarPersona(Persona persona) {
		// TODO Auto-generated method stub
		personaDao.borrarPersona(persona);
		
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
		personaDao.actualizarPersona(persona);
		if (persona.getDireccion()!=null)
		{
			direccion.actualizarDireccion(persona.getDireccion());
		}
		
	}

}
