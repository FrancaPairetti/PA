package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Modelo;

@Repository
public interface IModelo extends CrudRepository<Modelo, Integer>{

}
