package com.example.demo.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Marca")
public class Marca {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String nombre;
	@Column
	private String codigo;
	@Column
	private String descripcion;
	@Column
	private String pais;
	@OneToMany(mappedBy="marca")
	List<Modelo> modelo;
	//Constructor
	public Marca(int id, String nombre, String descripcion, String pais) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion= descripcion;
		this.pais = pais;
	}
	public Marca() {
	
	}
	//Getters y Setters
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public List<Modelo> getModelo() {
		return modelo;
	}
	public void setModelo(List<Modelo> modelo) {
		this.modelo = modelo;
	}
	
	
}
