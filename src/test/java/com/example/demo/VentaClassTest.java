package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.example.demo.interfaces.IEmpleado;
import com.example.demo.interfaces.IVenta;
import com.example.demo.modelo.Empleado;
import com.example.demo.modelo.Venta;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class VentaClassTest {

	@Autowired
	private IVenta repositorio;

	
	@Test
	public void guardarVenta() {
		Venta venta = new Venta();
		Venta ventaGuardada=repositorio.save(venta);
		
		assertNotNull(ventaGuardada);
		
	}
	
	@Test
	public void testBuscarVentaPorPrecio() {
		int precio= 15400;
		Venta venta = repositorio.findByPrecioFinal(precio);
		assertThat(venta.getPrecioFinal()).isEqualTo(precio);
	}

	//TEST AL CALCULO
	@Test
	public void testCalcularPrecioVenta() {
		double precioAuto=1000.00 ;
		int cantidad = 2;
		double impuesto=20;
		double precioVentaEsperado= 2400.00;
		Venta venta = new Venta();
		assertThat(venta.calcularPrecioVenta(cantidad, precioAuto,impuesto)).isEqualTo(precioVentaEsperado);
	}
	
	
}
