package com.espe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.espe.dao.PedidoDao;
import com.espe.model.Pedido;

public class PedidoController {

private List<Pedido> arrayList;
	
	public List<Pedido> getArrayList() {
		//return arrayList;
		PedidoDao pedidoDao = new PedidoDao();
		return pedidoDao.obtenerPedidos();
	}

	public void setArrayList(List<Pedido> arrayList) {
		this.arrayList = arrayList;
	}
	
	public List<Pedido> obtenerClientes(){
		List<Pedido> listaPedidos= new ArrayList<Pedido>();
		PedidoDao pedidoDAO = new PedidoDao();
		return pedidoDAO.obtenerPedidos();
	}
	
	public String editar(int id) {
		PedidoDao pedidoDAO = new PedidoDao();
		Pedido c = new Pedido();
		c = pedidoDAO.buscar(id);
		System.out.println(c);
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("pedido", c);
		return "/editar_pedido.xhtml";
	}
	
	public String actualizar(Pedido cliente) {
		PedidoDao pedidoDAO = new PedidoDao();
		pedidoDAO.editar(cliente);
		return "/index_pedido.html";
	}
	
	public String eliminar(int id) {
		PedidoDao pedidoDAO = new PedidoDao();
		pedidoDAO.eliminar(id);
		System.out.println("Pedido eliminado");
		return "/index_pedido.xhtml";
	}
	

	public String guardar(Pedido cliente) {
		PedidoDao pedidoDAO = new PedidoDao();
		pedidoDAO.guardar(cliente);
		System.out.println("Pedido creado exitosamente");
		return "/index_pedido.xhtml";
	}
	
	public String agregar(Pedido cliente) {
		Pedido c = new Pedido();
		Map<String, Object>sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("pedido",c);
		return "/crear_pedido.xhtml";
	}
}
