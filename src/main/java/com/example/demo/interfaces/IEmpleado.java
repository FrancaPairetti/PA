package com.example.demo.interfaces;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Empleado;
import com.example.demo.modelo.Marca;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer> {

	Optional<Empleado> findByCuit(String cuit);
}
