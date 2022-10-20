package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private int cantidad;
	@ManyToOne
	private Importacion importacion;
	@Column
	private int valorimp; //en esta columna se va a almanacer el % de impuesto para una determinada importación
	@Column
	private int precioFinal;
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Empleado empleado;
	@ManyToOne
	private Auto auto;
	
	//CONSTRUCTOR
	public Venta(int id, int cantidad, int impuestos, Auto auto, Importacion importacion, int precioFinal) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.auto = auto;
		this.importacion = importacion;
		this.precioFinal = precioFinal;
	}
	
	
	public Venta() {
		super();
	}


	//GETTERS Y SETTERS
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Auto getAuto() {
		return auto;
	}
	public void setAuto(Auto auto) {
		this.auto = auto;
	}
	public int getPrecioFinal() {
		return precioFinal;
	}
	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}


	public int getValorimp() {
		return valorimp;
	}


	public void setValorimp(int valorimp) {
		this.valorimp = valorimp;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Empleado getEmpleado() {
		return empleado;
	}


	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	
}
