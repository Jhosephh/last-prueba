package mx.edu.uttt.app.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.edu.uttt.app.web.models.entity.Ciudad;
import mx.edu.uttt.app.web.models.entity.Cliente;
import mx.edu.uttt.app.web.models.service.ICiudadService;
import mx.edu.uttt.app.web.models.service.IClienteService;



@Controller
@RequestMapping("/views/clientes")
public class ClienteController {
	
	
	@Autowired
	private IClienteService clienteService;

	@Autowired
	private ICiudadService CiudadService;

	
	
	@GetMapping("/")
	public String listarClientes(Model model) {
		
			List<Cliente> listadoClientes = clienteService.listarTodos();
			model.addAttribute("titulo", "Lista de Clientes");
			model.addAttribute("clientes", listadoClientes);
		return"/views/clientes/listar";
	}
	
	@GetMapping("/create")
	public String crear(Model model) {
		
		Cliente cliente = new Cliente();
		List<Ciudad> listCiudades = CiudadService.listaCiudades(); 
		
		model.addAttribute( "titulo", "Formulario Nuevo Cliente");
		model.addAttribute("cliente", cliente);
		model.addAttribute("ciudades", listCiudades);
		
		return "/views/clientes/frmCrear";
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Cliente cliente) {
		clienteService.guardar(cliente);
		System.out.println("Cliente guardado con exito");
		
		return "redirect:/views/clientes/";
	}
	
}
