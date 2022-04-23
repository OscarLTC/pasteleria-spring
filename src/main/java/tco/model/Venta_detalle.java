package tco.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@IdClass(Venta_detalle.class)
@Table(name = "venta_detalle")
public class Venta_detalle implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Id
	@Column(name = "VENTA_id")
	private Long idventa;

	@Id
	@Column(name = "PASTELES_id")
	private Long idpastel;
	


	private Integer cantidad;
	
	private Double subtotal;

	

	public Long getIdpastel() {
		return idpastel;
	}

	public void setIdpastel(Long idpastel) {
		this.idpastel = idpastel;
	}

	public Long getIdventa() {
		return idventa;
	}

	public void setIdventa(Long idventa) {
		this.idventa = idventa;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
}
