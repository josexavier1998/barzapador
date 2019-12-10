package com.espe.idao;

import java.util.List;
import com.espe.model.Pedido;




public interface IPedidoDao {

	public void guardar(Pedido pedido);
	public void editar(Pedido pedido);
	public Pedido buscar(int id);
	public void eliminar(int id);
	public List<Pedido> obtenerPedidos();
}
