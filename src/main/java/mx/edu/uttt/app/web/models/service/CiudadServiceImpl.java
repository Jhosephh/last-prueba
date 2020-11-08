package mx.edu.uttt.app.web.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uttt.app.web.models.entity.Ciudad;
import mx.edu.uttt.app.web.models.repository.CiudadRepository;



@Service
public class CiudadServiceImpl implements ICiudadService {
	
	@Autowired
	private CiudadRepository ciudadRepository;
	

	@Override
	public List<Ciudad> listaCiudades() {
		// TODO Auto-generated method stub
		return (List<Ciudad>) ciudadRepository.findAll();
	}

}
