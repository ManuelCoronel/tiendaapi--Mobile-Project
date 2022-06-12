package com.tiendaapi.tiendaapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.*;
import org.springframework.stereotype.Repository;

import com.tiendaapi.tiendaapi.entity.Tienda;

@Repository
public class TiendaDao implements ITiendaDao{
 private EntityManager entityManager;
 
	@Override
	public List<Tienda> findAll(){
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Tienda> theQuery = currentSession.createQuery("from Tienda",Tienda.class);
		List<Tienda>tiendas = theQuery.getResultList();
		// TODO Auto-generated method stub
		return tiendas;
	}

	@Override
	public Tienda findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Tienda tienda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		
	}

}
