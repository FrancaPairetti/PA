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
@Table(name = "Empleado")
public class Empleado {
	//Atributos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private int id;
		@Column
		private String nombre;
		@Column
		private String apellido;
		@Column
		private String cuit;
		@Column
		private String direccion;
		@Column
		private String mail;
		@Column
		private String telefono;
		@ManyToOne
		private Empleado empleado;
		@OneToMany(mappedBy= "empleado")
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
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getCuit() {
			return cuit;
		}
		public void setCuit(String cuit) {
			this.cuit = cuit;
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
		public Empleado getEmpleado() {
			return empleado;
		}
		public void setEmpleado(Empleado empleado) {
			this.empleado = empleado;
		}
		public List<Venta> getVenta() {
			return venta;
		}
		public void setVenta(List<Venta> venta) {
			this.venta = venta;
		}
		

}
