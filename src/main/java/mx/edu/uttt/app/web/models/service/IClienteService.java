package mx.edu.uttt.app.web.models.service;

import java.util.List;

import mx.edu.uttt.app.web.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> listarTodos();
	public void guardar(Cliente cliente); 
	public Cliente buscarPorId(Long id);
	public void eliminar(Long id); 
		
	
	
}
