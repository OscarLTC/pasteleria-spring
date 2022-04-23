package tco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tco.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long>{
	
}
