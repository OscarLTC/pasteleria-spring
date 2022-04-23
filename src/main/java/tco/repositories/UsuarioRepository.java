package tco.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tco.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	@Query(value = "select * \r\n"
			+ "from usuario u \r\n"
			+ "where u.nombre = :name and u.contraseña = :pass", nativeQuery = true)
	Usuario login(@Param("name") String nombre, @Param("pass") String contrasenia);
}
