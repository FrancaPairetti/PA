package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.modelo.Venta;


public interface IVenta extends CrudRepository<Venta, Integer> {

}
