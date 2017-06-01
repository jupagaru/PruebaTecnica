package com.jpgarcia.daoImpl;

import java.util.List;

import javax.persistence.Query;

import com.jpgarcia.app.Direcciones;
import com.jpgarcia.app.Domicilios;
import com.jpgarcia.connection.BasicService;
import com.jpgarcia.dao.DireccionDao;

public class DireccionDaoImpl extends BasicService implements DireccionDao {

	@Override
	public void guardarDireccion(Direcciones direccion) {
		// TODO Auto-generated method stub
	   try {
         transaction.begin();
         entityManager.persist(direccion);
         transaction.commit();
     } catch (Exception e) {
         transaction.rollback();
     }
  entityManagerFactory.close();
		
	}

	@Override
	public Direcciones ConsultarDireccion(Direcciones direccion) {
		// TODO Auto-generated method stub
	   return  entityManager.find( Direcciones.class, direccion.getIdDireccion());
	}

	@Override
	public List<Direcciones> listarDirecciones() {
		// TODO Auto-generated method stub
	   Query query = entityManager.createQuery("Select * from DIRECCIONES");
      List<Direcciones> list=(List<Direcciones>)query.getResultList();
   return list;
	}

	@Override
	public void borrarDireccion(Direcciones direccion) {
		// TODO Auto-generated method stub
	   try {
         transaction.begin();
         entityManager.remove(direccion);
         transaction.commit();
     } catch (Exception e) {
         transaction.rollback();
     }
  entityManagerFactory.close();
		
	}

	@Override
	public void actualizarDireccion(Direcciones direccion) {
		// TODO Auto-generated method stub
	   try {
         transaction.begin();
         entityManager.merge(direccion);
         transaction.commit();
     } catch (Exception e) {
         transaction.rollback();
     }
  entityManagerFactory.close();
		
	}

}
