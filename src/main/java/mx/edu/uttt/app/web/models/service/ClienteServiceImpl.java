package mx.edu.uttt.app.web.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uttt.app.web.models.entity.Cliente;
import mx.edu.uttt.app.web.models.repository.ClienteRepository;


@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private ClienteRepository ClienteRepository;
	
	@Override
	public List<Cliente> listarTodos() {
		// TODO Auto-generated method stub
		return (List<Cliente>) ClienteRepository.findAll();
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		ClienteRepository.save(cliente);
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return ClienteRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		ClienteRepository.deleteById(id);
	}

}
