package com.espe.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.espe.idao.IPedidoDao;
import com.espe.model.JPAUtil;
import com.espe.model.Pedido;
import com.espe.model.Producto;


public class PedidoDao implements IPedidoDao{
	
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	@Override
	public void guardar(Pedido pedido) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.persist(pedido);
		entity.getTransaction().commit();
	}

	@Override
	public void editar(Pedido pedido) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.merge(pedido);
		entity.getTransaction().commit();
	}

	@Override
	public Pedido buscar(int id) {
		// TODO Auto-generated method stub
		Pedido c = new Pedido();
		c= entity.find(Pedido.class,id);
		return c;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Pedido c = new Pedido();
		c= entity.find(Pedido.class,id);
		entity.getTransaction().begin();
		entity.remove(c);
		entity.getTransaction().commit();
	}

	@Override
	public List<Pedido> obtenerPedidos() {
		// TODO Auto-generated method stub
		List<Pedido> pedidoLista = new ArrayList<Pedido>();
		Query q = entity.createQuery("SELECT c FROM Pedido c");
		pedidoLista = q.getResultList();
		return pedidoLista;
	}

	

}
