package com.example.demo.interfaces;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Marca;

@Repository
public interface ICliente extends CrudRepository<Cliente, Integer> {
	
	Optional<Cliente> findByCuil(String cuil);

}
