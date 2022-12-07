package com.example.demo.interfaces;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Importacion;
import com.example.demo.modelo.Marca;
@Repository
public interface IImportacion extends CrudRepository<Importacion, Integer> {

	Optional<Importacion> findByNombre(String nombre);
}
