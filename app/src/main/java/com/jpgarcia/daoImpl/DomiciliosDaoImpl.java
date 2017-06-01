package com.jpgarcia.daoImpl;

import java.util.List;

import javax.persistence.Query;

import com.jpgarcia.app.Domicilios;
import com.jpgarcia.app.Persona;
import com.jpgarcia.connection.BasicService;
import com.jpgarcia.dao.DomicilioDao;

public class DomiciliosDaoImpl extends BasicService implements DomicilioDao{

	@Override
	public void crearDomicilio(Domicilios domicilio) {
		// TODO Auto-generated method stub
		  try {
	            transaction.begin();
	            entityManager.persist(domicilio);
	            transaction.commit();
	        } catch (Exception e) {
	            transaction.rollback();
	        }
		  entityManagerFactory.close();
	}

	@Override
	public Domicilios consultarDomicilios(Domicilios domicilio) {
		// TODO Auto-generated method stub
		return  entityManager.find( Domicilios.class, domicilio.getIdPersona());
	}

	@Override
	public List<Domicilios> listarDomicilios() {
		// TODO Auto-generated method stub
		 Query query = entityManager.createQuery("Select * from DOMICILIOS");
	      List<Domicilios> list=(List<Domicilios>)query.getResultList();
		return list;
	}

	@Override
	public void borrarDomicilio(Domicilios domicilio) {
		// TODO Auto-generated method stub
		  try {
	            transaction.begin();
	            entityManager.remove(domicilio);
	            transaction.commit();
	        } catch (Exception e) {
	            transaction.rollback();
	        }
		  entityManagerFactory.close();
	}

	@Override
	public void updateDomicilio(Domicilios domicilio) {
		// TODO Auto-generated method stub
		 try {
	            transaction.begin();
	            entityManager.merge(domicilio);
	            transaction.commit();
	        } catch (Exception e) {
	            transaction.rollback();
	        }
		  entityManagerFactory.close();
	}

}
