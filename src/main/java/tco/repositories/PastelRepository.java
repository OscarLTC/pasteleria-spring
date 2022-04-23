package tco.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tco.model.Pastel;

@Repository
public interface PastelRepository extends JpaRepository<Pastel, Long>{

	@Query(value = "select \r\n"
			+ "p.id, p.nombre, p.url,\r\n"
			+ "p.descripcion, p.precio, p.CATEGORIA_id,\r\n"
			+ "sum(vd.cantidad) as cantidad\r\n"
			+ "from pasteles p inner join venta_detalle vd\r\n"
			+ "on p.id = vd.PASTELES_id\r\n"
			+ "group by p.id order by cantidad desc limit 6", nativeQuery = true)
	List<Pastel> ranking();

	@Query(value = "select * \r\n"
			+ "from pasteles p\r\n"
			+ "where p.CATEGORIA_id  = :id", nativeQuery = true)
	List<Pastel> buscarCategoria(@Param("id") Long id);
	
	
	@Query(value = "select * \r\n"
			+ "from pasteles p \r\n"
			+ "where p.nombre like CONCAT('%',:nombre,'%')", nativeQuery = true)
	List<Pastel> buscar(@Param("nombre") String nombre);
}
