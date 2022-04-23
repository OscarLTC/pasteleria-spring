package tco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tco.model.Venta_detalle;

@Repository
public interface VentaDetalleRepository extends JpaRepository<Venta_detalle, Long>{

}
