package com.espe.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_cli;
	@Column
	private String nombre_cli;
	@Column
	private String apellido_cli;
	@Column
	private String cedula_cli;
	public Integer getId_cli() {
		return id_cli;
	}
	public void setId_cli(Integer id_cli) {
		this.id_cli = id_cli;
	}
	public String getNombre_cli() {
		return nombre_cli;
	}
	public void setNombre_cli(String nombre_cli) {
		this.nombre_cli = nombre_cli;
	}
	public String getApellido_cli() {
		return apellido_cli;
	}
	public void setApellido_cli(String apellido_cli) {
		this.apellido_cli = apellido_cli;
	}
	public String getCedula_cli() {
		return cedula_cli;
	}
	public void setCedula_cli(String cedula_cli) {
		this.cedula_cli = cedula_cli;
	}
	@Override
	public String toString() {
		return "Cliente [id_cli=" + id_cli + ", nombre_cli=" + nombre_cli + ", apellido_cli=" + apellido_cli
				+ ", cedula_cli=" + cedula_cli + "]";
	}
	
	
}
