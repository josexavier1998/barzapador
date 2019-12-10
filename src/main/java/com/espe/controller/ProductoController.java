package com.espe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import com.espe.dao.ProductoDao;
import com.espe.model.Producto;

public class ProductoController {

private List<Producto> arrayList;
	
	public List<Producto> getArrayList() {
		//return arrayList;
		ProductoDao productoDao = new ProductoDao();
		return productoDao.obtenerProductos();
	}

	public void setArrayList(List<Producto> arrayList) {
		this.arrayList = arrayList;
	}
	
	public List<Producto> obtenerClientes(){
		List<Producto> listaProductos= new ArrayList<Producto>();
		ProductoDao productoDAO = new ProductoDao();
		return productoDAO.obtenerProductos();
	}
	
	public String editar(int id) {
		ProductoDao productoDAO = new ProductoDao();
		Producto c = new Producto();
		c = productoDAO.buscar(id);
		System.out.println(c);
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("producto", c);
		return "/editar_producto.xhtml";
	}
	
	public String actualizar(Producto producto) {
		ProductoDao productoDAO = new ProductoDao();
		productoDAO.editar(producto);
		return "/index_pedido.html";
	}
	
	public String eliminar(int id) {
		ProductoDao productoDAO = new ProductoDao();
		productoDAO.eliminar(id);
		System.out.println("Producto eliminado");
		return "/index_producto.xhtml";
	}
	

	public String guardar(Producto producto) {
		ProductoDao productoDAO = new ProductoDao();
		productoDAO.guardar(producto);
		System.out.println("Pedido creado exitosamente");
		return "/index_producto.xhtml";
	}
	
	public String agregar(Producto producto) {
		Producto c = new Producto();
		Map<String, Object>sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("producto",c);
		return "/crear_producto.xhtml";
	}
}
