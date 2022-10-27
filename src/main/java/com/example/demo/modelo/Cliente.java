package com.example.demo.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {
	//Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private int id;
		@Column
		private String nombre;
		@Column
		private String cuil;
		@Column
		private String direccion;
		@Column
		private String mail;
		@Column
		private String telefono;
		@Column
		private boolean esCliente;
		@ManyToOne
		private Cliente cliente;
		@OneToMany(mappedBy= "cliente")
		List<Venta> venta;
		
		// GETTERS Y SETTERS
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getCuil() {
			return cuil;
		}
		public void setCuil(String cuil) {
			this.cuil = cuil;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public boolean isEsCliente() {
			return esCliente;
		}
		public void setEsCliente(boolean esCliente) {
			this.esCliente = esCliente;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		public List<Venta> getVenta() {
			return venta;
		}
		public void setVenta(List<Venta> venta) {
			this.venta = venta;
		}
		
}
