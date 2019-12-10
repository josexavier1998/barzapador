package com.espe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


import com.espe.dao.ClienteDao;
import com.espe.model.Cliente;

@ManagedBean(name="clienteBean")
@RequestScoped
public class ClienteController {
	
	private List<Cliente> arrayList;
	
	public List<Cliente> getArrayList() {
		//return arrayList;
		ClienteDao clienteDao = new ClienteDao();
		return clienteDao.obtenerClientes();
	}


	public void setArrayList(List<Cliente> arrayList) {
		this.arrayList = arrayList;
	}
	
	public List<Cliente> obtenerClientes(){
		List<Cliente> listaClientes= new ArrayList<Cliente>();
		ClienteDao clienteDAO = new ClienteDao();
	
		/*Cliente c1 = new Cliente();
		c1.setId_cli(1);
		c1.setNombre_cli("Josu");
		c1.setApellido_cli("Lozano");
		c1.setCedula_cli("2350514762");
		Cliente c2 = new Cliente();
		c2.setId_cli(2);
		c2.setNombre_cli("Jose");
		c2.setApellido_cli("Buenaventura");
		c2.setCedula_cli("1001833159");
		
		listaClientes.add(c1);
		listaClientes.add(c2);*/
		
		return clienteDAO.obtenerClientes();
	}
	public String editar(int id) {
		ClienteDao clienteDAO = new ClienteDao();
		Cliente c = new Cliente();
		c = clienteDAO.buscar(id);
		System.out.println(c);
		
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cliente", c);
		return "/editar.xhtml";
	}
	
	public String actualizar(Cliente cliente) {
		ClienteDao clienteDAO = new ClienteDao();
		clienteDAO.editar(cliente);
		return "/index.html";
	}
	
	public String eliminar(int id) {
		ClienteDao clienteDAO = new ClienteDao();
		clienteDAO.eliminar(id);
		System.out.println("Cliente eliminado");
		return "/index.xhtml";
	}
	
	public String agregar() {
		Cliente c = new Cliente();
		Map<String, Object>sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("cliente",c);
		return "cliente.xhtml";
	}
	
	public String guardar(Cliente cliente) {
		ClienteDao clienteDAO = new ClienteDao();
		clienteDAO.guardar(cliente);
		return "index.xhtml";
	}
	
}
