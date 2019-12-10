package com.espe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id_pro;
		@Column
		private String nombre_pro;
		@Column
		private String descripcion_pro;
		@Column
		private String cantidad_pro;
		@Column
		private String precio_pro;
		@Column
		private String estado_pro;
		public Integer getId_pro() {
			return id_pro;
		}
		public void setId_pro(Integer id_pro) {
			this.id_pro = id_pro;
		}
		public String getNombre_pro() {
			return nombre_pro;
		}
		public void setNombre_pro(String nombre_pro) {
			this.nombre_pro = nombre_pro;
		}
		public String getDescripcion_pro() {
			return descripcion_pro;
		}
		public void setDescripcion_pro(String descripcion_pro) {
			this.descripcion_pro = descripcion_pro;
		}
		public String getCantidad_pro() {
			return cantidad_pro;
		}
		public void setCantidad_pro(String cantidad_pro) {
			this.cantidad_pro = cantidad_pro;
		}
		public String getPrecio_pro() {
			return precio_pro;
		}
		public void setPrecio_pro(String precio_pro) {
			this.precio_pro = precio_pro;
		}
		public String getEstado_pro() {
			return estado_pro;
		}
		public void setEstado_pro(String estado_pro) {
			this.estado_pro = estado_pro;
		}
		@Override
		public String toString() {
			return "Producto [id_pro=" + id_pro + ", nombre_pro=" + nombre_pro + ", descripcion_pro=" + descripcion_pro
					+ ", cantidad_pro=" + cantidad_pro + ", precio_pro=" + precio_pro + ", estado_pro=" + estado_pro
					+ "]";
		}
		
		
}
