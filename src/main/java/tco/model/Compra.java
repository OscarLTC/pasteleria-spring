package tco.model;

import java.util.Collection;

public class Compra {
	private Long idusuario;
	private Collection<CompraDetalle> detalle;
	
	public Long getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}
	public Collection<CompraDetalle> getDetalle() {
		return detalle;
	}
	public void setDetalle(Collection<CompraDetalle> detalle) {
		this.detalle = detalle;
	}
	
	
}
