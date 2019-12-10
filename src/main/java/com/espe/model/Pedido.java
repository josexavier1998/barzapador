package com.espe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_pe;
	@Column
	private Integer id_pro;
	@Column
	private Integer id_cli;
	@Column
	private String nombre_pe;
	@Column
	private String cantidad_pe;
	@Column
	private String total_pe;
	public Integer getId_pe() {
		return id_pe;
	}
	public void setId_pe(Integer id_pe) {
		this.id_pe = id_pe;
	}
	public Integer getId_pro() {
		return id_pro;
	}
	public void setId_pro(Integer id_pro) {
		this.id_pro = id_pro;
	}
	public Integer getId_cli() {
		return id_cli;
	}
	public void setId_cli(Integer id_cli) {
		this.id_cli = id_cli;
	}
	public String getNombre_pe() {
		return nombre_pe;
	}
	public void setNombre_pe(String nombre_pe) {
		this.nombre_pe = nombre_pe;
	}
	public String getCantidad_pe() {
		return cantidad_pe;
	}
	public void setCantidad_pe(String cantidad_pe) {
		this.cantidad_pe = cantidad_pe;
	}
	public String getTotal_pe() {
		return total_pe;
	}
	public void setTotal_pe(String total_pe) {
		this.total_pe = total_pe;
	}
	
}
