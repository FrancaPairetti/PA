package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Importacion;
@Repository
public interface IImportacion extends CrudRepository<Importacion, Integer> {

}
