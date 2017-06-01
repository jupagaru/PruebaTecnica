package com.jpgarcia.command.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpgarcia.app.Ciudad;
import com.jpgarcia.command.CiudadCommand;
import com.jpgarcia.dao.CiudadDao;

public class CiudadCommandImpl implements CiudadCommand {
	
	@Autowired
	CiudadDao ciudadDao;

	@Override
	public void crearCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		ciudadDao.crearCiudad(ciudad);
	}

	@Override
	public Ciudad ConsultarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		return ciudadDao.ConsultarCiudad(ciudad);
	}

	@Override
	public void borrarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		ciudadDao.borrarCiudad(ciudad);
	}

	@Override
	public void actualizarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		ciudadDao.actualizarCiudad(ciudad);
	}

	@Override
	public List<Ciudad> listarCiudades() {
		// TODO Auto-generated method stub
		return ciudadDao.listarCiudades();
	}

}
