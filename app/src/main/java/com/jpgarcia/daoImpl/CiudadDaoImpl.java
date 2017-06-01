package com.jpgarcia.daoImpl;

import java.util.List;

import javax.persistence.Query;

import com.jpgarcia.app.Ciudad;
import com.jpgarcia.app.Domicilios;
import com.jpgarcia.connection.BasicService;
import com.jpgarcia.dao.CiudadDao;

public class CiudadDaoImpl extends BasicService implements CiudadDao {

	@Override
	public void crearCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
	   try {
         transaction.begin();
         entityManager.persist(ciudad);
         transaction.commit();
     } catch (Exception e) {
         transaction.rollback();
     }
  entityManagerFactory.close();
		
	}

	@Override
	public Ciudad ConsultarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
	   return  entityManager.find( Ciudad.class, ciudad.getIdCiudad());
	}

	@Override
	public void borrarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
	   try {
         transaction.begin();
         entityManager.remove(ciudad);
         transaction.commit();
     } catch (Exception e) {
         transaction.rollback();
     }
  entityManagerFactory.close();
		
	}

	@Override
	public void actualizarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
	   try {
         transaction.begin();
         entityManager.merge(ciudad);
         transaction.commit();
     } catch (Exception e) {
         transaction.rollback();
     }
  entityManagerFactory.close();
		
	}

	@Override
	public List<Ciudad> listarCiudades() {
		// TODO Auto-generated method stub
	   Query query = entityManager.createQuery("Select * from CIUDAD");
      List<Ciudad> list=(List<Ciudad>)query.getResultList();
   return list;
	}

}
