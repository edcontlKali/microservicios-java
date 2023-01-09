package mx.com.pruebas.mongo.model.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import mx.com.pruebas.mongo.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String>{

	
	@Query("{ '_id' : ?0 }")
	Optional<Usuario> findById(String id);
}
