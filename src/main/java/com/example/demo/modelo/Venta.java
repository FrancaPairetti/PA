package com.example.demo.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "Venta")
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	@Column
	private Date fechaVenta;
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
	
	public Venta() {
		super();
	}


	public Venta(int id, Date fechaVenta, int cantidad, Importacion importacion, int valorimp, int precioFinal,
			Cliente cliente, Empleado empleado, Auto auto) {
		super();
		this.id = id;
		this.fechaVenta = fechaVenta;
		this.cantidad = cantidad;
		this.importacion = importacion;
		this.valorimp = valorimp;
		this.precioFinal = precioFinal;
		this.cliente = cliente;
		this.empleado = empleado;
		this.auto = auto;
	}
	


	public Venta(Date fechaVenta, int cantidad) {
		super();
		this.fechaVenta = fechaVenta;
		this.cantidad = cantidad;
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


	public Date getFechaVenta() {
		return fechaVenta;
	}


	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}


	public Importacion getImportacion() {
		return importacion;
	}


	public void setImportacion(Importacion importacion) {
		this.importacion = importacion;
	}
	
	//CALCULAR PRECIO DE VENTA FINAL 
	
	public double calcularPrecioVenta(int cantidad, double precioAuto , double impuesto) {
		double precioVenta= (cantidad*precioAuto)+(((precioAuto/100)*impuesto)*cantidad);
		return precioVenta;
	}
	
	
	
	
	
}
