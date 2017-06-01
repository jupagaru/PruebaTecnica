package com.jpgarcia.command.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpgarcia.app.Direcciones;
import com.jpgarcia.command.DireccionCommand;
import com.jpgarcia.dao.DireccionDao;

public class DireccionCommandImpl implements DireccionCommand {
	
	@Autowired
	DireccionDao direccionDao;

	@Override
	public void guardarDireccion(Direcciones direccion) {
		// TODO Auto-generated method stub
		direccionDao.guardarDireccion(direccion);
	}

	@Override
	public Direcciones ConsultarDireccion(Direcciones direccion) {
		// TODO Auto-generated method stub
		return direccionDao.ConsultarDireccion(direccion);
	}

	@Override
	public List<Direcciones> listarDirecciones() {
		// TODO Auto-generated method stub
		return direccionDao.listarDirecciones();
	}

	@Override
	public void borrarDireccion(Direcciones direccion) {
		// TODO Auto-generated method stub
		
		direccionDao.borrarDireccion(direccion);
		
	}

	@Override
	public void actualizarDireccion(Direcciones direccion) {
		// TODO Auto-generated method stub
		
		direccionDao.actualizarDireccion(direccion);
		
	}
	
	

}
