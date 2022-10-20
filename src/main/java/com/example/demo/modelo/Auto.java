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
@Table(name = "Auto")
public class Auto {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private int ano;
	@Column
	private String gama;
	@Column
	private String tipoCombustible;
	@Column
	private String color;
	@Column
	private String estado;
	@Column
	private String cantPuertas;
	@Column
	private String cantKM;
	@Column
	private String precioCosto;
	@Column
	private String precioVenta;
	@ManyToOne
	private Modelo modelo;
	@ManyToOne
	private Importacion importacion;
	@OneToMany(mappedBy= "auto")
	List<Venta> venta;
	
	//GETTERS Y SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getGama() {
		return gama;
	}
	public void setGama(String gama) {
		this.gama = gama;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCantPuertas() {
		return cantPuertas;
	}
	public void setCantPuertas(String cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	public String getCantKM() {
		return cantKM;
	}
	public void setCantKM(String cantKM) {
		this.cantKM = cantKM;
	}
	public String getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(String precioCosto) {
		this.precioCosto = precioCosto;
	}
	public String getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(String precioVenta) {
		this.precioVenta = precioVenta;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public Importacion getImportacion() {
		return importacion;
	}
	public void setImportacion(Importacion importacion) {
		this.importacion = importacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<Venta> getVenta() {
		return venta;
	}
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}
	
	
	
}
