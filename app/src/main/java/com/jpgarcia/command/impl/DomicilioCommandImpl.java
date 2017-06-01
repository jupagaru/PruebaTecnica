package com.jpgarcia.command.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.jpgarcia.app.Domicilios;
import com.jpgarcia.command.DomicilioCommand;
import com.jpgarcia.dao.DomicilioDao;

public class DomicilioCommandImpl implements DomicilioCommand {

	@Autowired
	DomicilioDao domicilioDao;

	@Override
	public void crearDomiciliio(Domicilios domicilio) {
		// TODO Auto-generated method stub
		domicilioDao.crearDomicilio(domicilio);

	}

	@Override
	public Domicilios consultarDomicilio(Domicilios domicilio) {
		// TODO Auto-generated method stub
		return domicilioDao.consultarDomicilios(domicilio);
	}

	@Override
	public void borrarDomicilio(Domicilios domicilio) {
		// TODO Auto-generated method stub

		domicilioDao.borrarDomicilio(domicilio);

	}

	@Override
	public void actualizarDomicilio(Domicilios domicilio) {
		// TODO Auto-generated method stub

		domicilioDao.updateDomicilio(domicilio);
	}

	@Override
	public List<Domicilios> listarDomicilios() {
		// TODO Auto-generated method stub
		return domicilioDao.listarDomicilios();
	}

}
