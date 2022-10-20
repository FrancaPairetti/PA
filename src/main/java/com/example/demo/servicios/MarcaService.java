package com.example.demo.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaceService.IMarcaService;
import com.example.demo.interfaces.IAuto;
import com.example.demo.interfaces.ICliente;
import com.example.demo.interfaces.IEmpleado;
import com.example.demo.interfaces.IImportacion;
import com.example.demo.interfaces.IMarca;
import com.example.demo.interfaces.IModelo;
import com.example.demo.interfaces.IVenta;
import com.example.demo.modelo.Auto;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Empleado;
import com.example.demo.modelo.Importacion;
import com.example.demo.modelo.Marca;
import com.example.demo.modelo.Modelo;
import com.example.demo.modelo.Venta;

@Service
public class MarcaService implements IMarcaService {
	
	@Autowired
	private IMarca data;
	@Override
	public List<Marca> listar() {
		return (List<Marca>)data.findAll();
	}

	@Override
	public Optional<Marca> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Marca m) {
		int res=0;
		Marca marca=data.save(m);
		if (!marca.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}
	
	//MODELO
	
	@Autowired
	private IModelo data1;

	@Override
	public List<Modelo> listarModelo() {
		return (List<Modelo>)data1.findAll();
	}

	@Override
	public Optional<Modelo> listarModeloId(int id) {
		return data1.findById(id);
	}

	@Override
	public int saveModelo(Modelo mod) {
		int res=0;
		Modelo modelo=data1.save(mod);
		if (!modelo.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteModelo(int id) {
		data1.deleteById(id);
		
	}
	//IMPORTACION
	@Autowired
	private IImportacion data11;
	
	@Override
	public List<Importacion> listarImp() {
		return (List<Importacion>)data11.findAll();
	}

	@Override
	public Optional<Importacion> listarImpId(int id) {
		return data11.findById(id);
	}

	@Override
	public int saveImp(Importacion imp) {
		int res=0;
		Importacion impor=data11.save(imp);
		if (!impor.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteImp(int id) {
		data11.deleteById(id);
		
	}
	
	//CLIENTE
	@Autowired
	private ICliente data111;
	@Override
	public List<Cliente> listarCliente() {
		return (List<Cliente>)data111.findAll();
	}

	@Override
	public Optional<Cliente> listarClienteId(int id) {
		
		return data111.findById(id);
	}

	@Override
	public int saveCliente(Cliente c) {
		int res=0;
		Cliente cliente=data111.save(c);
		if (!cliente.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteCliente(int id) {
		data111.deleteById(id);
		
	}
	
	
	
	//AUTO
	@Autowired
	private IAuto data1111;
	@Override
	public List<Auto> listarAuto() {
		return (List<Auto>)data1111.findAll();
	}

	@Override
	public Optional<Auto> listarAutoId(int id) {
		
		return data1111.findById(id);
	}

	@Override
	public int saveAuto(Auto a) {
		int res=0;
		Auto auto=data1111.save(a);
		if (!auto.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteAuto(int id) {
		data1111.deleteById(id);
		
	}

	//EMPLEADO
	@Autowired
	private IEmpleado data11111;
	@Override
	public List<Empleado> listarEmpleado() {
		return (List<Empleado>)data11111.findAll();
	}

	@Override
	public Optional<Empleado> listarEmpleadoId(int id) {
		
		return data11111.findById(id);
	}

	@Override
	public int saveEmpleado(Empleado e) {
		int res=0;
		Empleado empleado=data11111.save(e);
		if (!empleado.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteEmpleado(int id) {
		data11111.deleteById(id);
		
	}
	
	//VENTA
		@Autowired
		private IVenta data111111;
		@Override
		public List<Venta> listarVenta() {
			return (List<Venta>)data111111.findAll();
		}

		@Override
		public Optional<Venta> listarVentaId(int id) {
			
			return data111111.findById(id);
		}

		@Override
		public int saveVenta(Venta v) {
			int res=0;
			Venta venta=data111111.save(v);
			if (!venta.equals(null)) {
				res=1;
			}
			return res;
		}

		@Override
		public void deleteVenta(int id) {
			data111111.deleteById(id);
			
		}
}
