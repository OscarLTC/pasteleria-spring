package tco.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tco.model.Compra;
import tco.model.CompraDetalle;
import tco.model.Venta;
import tco.model.Venta_detalle;
import tco.repositories.VentaDetalleRepository;
import tco.repositories.VentaRepository;


@Service
public class CompraServiceImpl implements CompraService{
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@Autowired
	private VentaDetalleRepository ventaDetalleRepository;


	@Override
	@Transactional
	public void guardarCompra(Compra compra) {
		
		Venta venta = new Venta();
		venta.setUsuario(compra.getIdusuario());
		venta.setTotal(compra.getDetalle().stream().mapToDouble(detalle -> detalle.getSubtotal()).sum());
		venta.setFecha(new Date());
		
		ventaRepository.save(venta);
		
		for (CompraDetalle detalle : compra.getDetalle()) 
		{
			Venta_detalle ventaDetalle = new Venta_detalle();
			ventaDetalle.setIdpastel(detalle.getIdpastel());
			ventaDetalle.setIdventa(venta.getId());
			ventaDetalle.setSubtotal(detalle.getSubtotal());
			ventaDetalle.setCantidad(detalle.getCantidad());
			
			ventaDetalleRepository.save(ventaDetalle);
		}
		
	}
	
	
}
