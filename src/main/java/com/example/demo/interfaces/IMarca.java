package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Marca;

@Repository
public interface IMarca extends CrudRepository<Marca, Integer>{

}
