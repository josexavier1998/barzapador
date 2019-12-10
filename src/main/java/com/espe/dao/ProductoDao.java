package com.espe.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.espe.idao.IProductoDao;
import com.espe.model.JPAUtil;
import com.espe.model.Producto;

public class ProductoDao implements IProductoDao{

	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.persist(producto);
		entity.getTransaction().commit();
	}

	@Override
	public void editar(Producto producto) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.merge(producto);
		entity.getTransaction().commit();
	}

	@Override
	public Producto buscar(int id) {
		// TODO Auto-generated method stub
		Producto c = new Producto();
		c= entity.find(Producto.class,id);
		return c;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Producto c = new Producto();
		c= entity.find(Producto.class,id);
		entity.getTransaction().begin();
		entity.remove(c);
		entity.getTransaction().commit();
	}

	@Override
	public List<Producto> obtenerProductos() {
		// TODO Auto-generated method stub
		List<Producto> productoLista = new ArrayList<Producto>();
		Query q = entity.createQuery("SELECT c FROM Producto c");
		productoLista = q.getResultList();
		return productoLista;
	}

}
