package com.tiendaapi.tiendaapi.dao;

import java.util.List;

import com.tiendaapi.tiendaapi.entity.Tienda;

public interface ITiendaDao {

		public List<Tienda>findAll();
		public Tienda findById(int id);
		public void save(Tienda tienda);
		public void deleteByID(int id);
		
}
