package mx.edu.uttt.app.web.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.edu.uttt.app.web.models.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
