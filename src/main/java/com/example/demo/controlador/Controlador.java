package com.example.demo.controlador;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.IMarcaService;
import com.example.demo.modelo.Auto;
import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Empleado;
import com.example.demo.modelo.Importacion;
import com.example.demo.modelo.Marca;
import com.example.demo.modelo.Modelo;
import com.example.demo.modelo.Venta;


@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private IMarcaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Marca>marcas=service.listar();
		model.addAttribute("marcas", marcas);
		return "listarMarca";
	 } 
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("marca", new Marca());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Validated Marca m, Model model) {
		service.save(m);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		java.util.Optional<Marca>marca=service.listarId(id);
		model.addAttribute("marca", marca);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "index";
	}
	
	//MODELO
	
	@GetMapping("/listarModelo")
	public String listarModelo(Model model) {
		List<Modelo>modelo=service.listarModelo();
		model.addAttribute("modelo", modelo);
		return "listarModelo";
	 } 
	
	@GetMapping("/newModelo")
	public String agregarModelo(Model model) {
		List<Marca> listMarcas =service.listar();
		model.addAttribute("modelo", new Modelo());
		model.addAttribute("listMarcas", listMarcas);
		return "crearModelo";
	}
	@PostMapping("/saveModelo")
	public String saveModelo(@Validated Modelo mod, Model model) {
		service.saveModelo(mod);
		return "redirect:/listarModelo";
	}
	
	@GetMapping("/editarModelo/{id}")
	public String editarModelo(@PathVariable int id, Model model) {
		java.util.Optional<Modelo>modelo=service.listarModeloId(id);
		List<Marca> listMarcas =service.listar();
		model.addAttribute("modelo", modelo);
		model.addAttribute("listMarcas", listMarcas);
		return "crearModelo";
	}
	
	@GetMapping("/eliminarModelo/{id}")
	public String deleteModelo(Model model, @PathVariable int id) {
		service.deleteModelo(id);
		return "redirect:/listarModelo";
	}
	
	//IMPORTACION
	
	@GetMapping("/listarImp")
	public String listarImp(Model model) {
		List<Importacion>impor=service.listarImp();
		model.addAttribute("importacion", impor);
		return "listarImp";
	 } 
	
	@GetMapping("/newImp")
	public String agregarImp(Model model) {
		model.addAttribute("importacion", new Importacion());
		return "crearImp";
	}
	@PostMapping("/saveImp")
	public String saveImp(@Validated Importacion imp, Model model) {
		service.saveImp(imp);
		return "redirect:/listarImp";
	}
	
	@GetMapping("/editarImp/{id}")
	public String editarImp(@PathVariable int id, Model model) {
		java.util.Optional<Importacion>importacion=service.listarImpId(id);
		model.addAttribute("importacion", importacion);
		return "crearImp";
	}
	
	@GetMapping("/eliminarImp/{id}")
	public String deleteImp(Model model, @PathVariable int id) {
		service.deleteImp(id);
		return "redirect:/listarImp";
	}
	
	//CLIENTE 
	
	@GetMapping("/listarCliente")
	public String listarCliente(Model model) {
		List<Cliente>cliente=service.listarCliente();
		model.addAttribute("cliente", cliente);
		return "listarCliente";
	 } 
	
	@GetMapping("/newCliente")
	public String agregarCliente(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "crearCliente";
	}
	@PostMapping("/saveCliente")
	public String saveCliente(@Validated Cliente cliente, Model model) {
		service.saveCliente(cliente);
		return "redirect:/listarCliente";
	}
	
	@GetMapping("/editarCliente/{id}")
	public String editarCliente(@PathVariable int id, Model model) {
		java.util.Optional<Cliente>cliente=service.listarClienteId(id);
		model.addAttribute("cliente", cliente);
		return "crearCliente";
	}
	
	@GetMapping("/eliminarCliente/{id}")
	public String deleteCliente(Model model, @PathVariable int id) {
		service.deleteCliente(id);
		return "redirect:/listarCliente";
	}
	
	//EMPLEADO
	
		@GetMapping("/listarEmpleado")
		public String listarEmpleado(Model model) {
			List<Empleado>empleado=service.listarEmpleado();
			model.addAttribute("empleado", empleado);
			return "listarEmpleado";
		 } 
		
		@GetMapping("/newEmpleado")
		public String agregarEmpleado(Model model) {
			model.addAttribute("empleado", new Empleado());
			return "crearEmpleado";
		}
		@PostMapping("/saveEmpleado")
		public String saveEmpleado(@Validated Empleado empleado, Model model) {
			service.saveEmpleado(empleado);
			return "redirect:/listarEmpleado";
		}
		
		@GetMapping("/editarEmpleado/{id}")
		public String editarEmpleado(@PathVariable int id, Model model) {
			java.util.Optional<Empleado>empleado=service.listarEmpleadoId(id);
			model.addAttribute("empleado", empleado);
			return "crearEmpleado";
		}
		
		@GetMapping("/eliminarEmpleado/{id}")
		public String deleteEmpleado(Model model, @PathVariable int id) {
			service.deleteEmpleado(id);
			return "redirect:/listarEmpleado";
		}
		
	//AUTO
	@GetMapping("/listarAuto")
	public String listarAuto(Model model) {
		List<Auto>auto=service.listarAuto();
		model.addAttribute("auto", auto);
		return "listarAuto";
	 } 
	
	@GetMapping("/newAuto")
	public String agregarAuto(Model model) {
		List<Modelo> listModelo =service.listarModelo();
		List<Importacion> listImp =service.listarImp();
		model.addAttribute("auto", new Auto());
		model.addAttribute("listModelo", listModelo);
		model.addAttribute("listImp", listImp);
		return "crearAuto";
	}
	@PostMapping("/saveAuto")
	public String saveAuto(@Validated Auto a, Model model) {
		service.saveAuto(a);
		return "redirect:/listarAuto";
	}
	
	@GetMapping("/editarAuto/{id}")
	public String editarAuto(@PathVariable int id, Model model) {
		java.util.Optional<Auto>auto=service.listarAutoId(id);
		List<Modelo> listModelo =service.listarModelo();
		List<Importacion> listImp =service.listarImp();
		model.addAttribute("auto", auto);
		model.addAttribute("listModelo", listModelo);
		model.addAttribute("listImp", listImp);
		return "crearAuto";
	}
	
	@GetMapping("/eliminarAuto/{id}")
	public String deleteAuto(Model model, @PathVariable int id) {
		service.deleteAuto(id);
		return "redirect:/listarAuto";
	}
	
	//VENTA
	@GetMapping("/listarVenta")
	public String listarVenta(Model model) {
		List<Venta>venta=service.listarVenta();
		model.addAttribute("venta", venta);
		return "listarVenta";
	 } 
	@GetMapping("/newVenta")
	public String agregarVenta(Model model) {
		List<Cliente> listCliente =service.listarCliente();
		List<Empleado> listEmpleado =service.listarEmpleado();
		List<Auto> listAuto =service.listarAuto();
		model.addAttribute("venta", new Venta());
		model.addAttribute("listCliente", listCliente);
		model.addAttribute("listEmpleado", listEmpleado);
		model.addAttribute("listAuto", listAuto);
		return "crearVenta";
	}
	@PostMapping("/saveVenta")
	public String saveVenta(@Validated Venta v, Model model) {
		service.saveVenta(v);
		return "redirect:/listarVenta";
	}
	

	@GetMapping("/editarVenta/{id}")
	public String editarVenta(@PathVariable int id, Model model) {
		java.util.Optional<Venta>venta=service.listarVentaId(id);
		List<Cliente> listCliente =service.listarCliente();
		List<Empleado> listEmpleado =service.listarEmpleado();
		List<Auto> listAuto =service.listarAuto();
		model.addAttribute("venta",venta);
		model.addAttribute("listCliente", listCliente);
		model.addAttribute("listEmpleado", listEmpleado);
		model.addAttribute("listAuto", listAuto);
		return "crearVenta";
	}
	
	@GetMapping("/eliminarVenta/{id}")
	public String deleteVenta(Model model, @PathVariable int id) {
		service.deleteVenta(id);
		return "redirect:/listarVenta";
	}
	
	
}
