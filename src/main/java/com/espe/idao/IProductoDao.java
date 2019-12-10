package com.espe.idao;

import java.util.List;
import com.espe.model.Producto;

public interface IProductoDao {

	public void guardar(Producto producto);
	public void editar(Producto producto);
	public Producto buscar(int id);
	public void eliminar(int id);
	public List<Producto> obtenerProductos();
}
