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
@Table(name = "Modelo")
public class Modelo {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String nombre;
	@Column
	private int ano;
	@Column
	private String tipoModelo;
	@ManyToOne
	private Marca marca;
	@OneToMany(mappedBy="modelo")
	List<Auto> auto;
	
	//Constructor
	public Modelo(int id, String nombre, int ano, String tipoModelo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ano= ano;
		this.tipoModelo = tipoModelo;
	}
	
	public Modelo() {
	
	}

	//Getter y setter
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipoModelo() {
		return tipoModelo;
	}

	public void setTipoModelo(String tipoModelo) {
		this.tipoModelo = tipoModelo;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Auto> getAuto() {
		return auto;
	}

	public void setAuto(List<Auto> auto) {
		this.auto = auto;
	}
	
	
}
