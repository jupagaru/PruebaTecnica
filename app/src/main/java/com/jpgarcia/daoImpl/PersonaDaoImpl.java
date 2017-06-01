package com.jpgarcia.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jpgarcia.app.Domicilios;
import com.jpgarcia.app.Persona;
import com.jpgarcia.connection.BasicService;
import com.jpgarcia.dao.PersonaDao;

public class PersonaDaoImpl extends BasicService implements PersonaDao {

	@Override
	public void crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		  try {
	            transaction.begin();
	            entityManager.persist(persona);
	            transaction.commit();
	        } catch (Exception e) {
	            transaction.rollback();
	        }
		  entityManagerFactory.close();
	}

	@Override
	public Persona consultarPersona(Persona persona) {
		// TODO Auto-generated method stub
		
		return entityManager.find( Persona.class, persona.getId() );
		
	}

	@Override
	public List<Persona> listarPersonas() {
		// TODO Auto-generated method stub
		 Query query = entityManager.createQuery("Select * from DOMICILIOS");
	      List<Persona> list=(List<Persona>)query.getResultList();
		return list;
	}

	@Override
	public void borrarPersona(Persona persona) {
		// TODO Auto-generated method stub
		  try {
	            transaction.begin();
	            entityManager.remove(persona);
	            transaction.commit();
	        } catch (Exception e) {
	            transaction.rollback();
	        }
		  
		 entityManagerFactory.close();
	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		 try {
	            transaction.begin();
	            entityManager.merge(persona);
	            transaction.commit();
	        } catch (Exception e) {
	            transaction.rollback();
	        }
		  
		 entityManagerFactory.close();
	}

}
