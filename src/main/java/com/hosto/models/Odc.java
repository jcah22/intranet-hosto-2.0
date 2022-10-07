package com.hosto.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Odc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_odc;
	
	private String descripcion;
	
	private String factura;
	
	private Date fecha;
	
	private Boolean flete;
	
	private Double total;
	
	private String cfdi;
	
	
	@ManyToOne
	@JoinColumn(name = "req_id")
	private Req req;


	public Odc() {
		
	}


	public Odc(Integer id_odc, String descripcion, String factura, Date fecha, Boolean flete, Double total, String cfdi,
			Req req) {
		super();
		this.id_odc = id_odc;
		this.descripcion = descripcion;
		this.factura = factura;
		this.fecha = fecha;
		this.flete = flete;
		this.total = total;
		this.cfdi = cfdi;
		this.req = req;
	}


	public Integer getId_odc() {
		return id_odc;
	}


	public void setId_odc(Integer id_odc) {
		this.id_odc = id_odc;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getFactura() {
		return factura;
	}


	public void setFactura(String factura) {
		this.factura = factura;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Boolean getFlete() {
		return flete;
	}


	public void setFlete(Boolean flete) {
		this.flete = flete;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public String getCfdi() {
		return cfdi;
	}


	public void setCfdi(String cfdi) {
		this.cfdi = cfdi;
	}


	public Req getReq() {
		return req;
	}


	public void setReq(Req req) {
		this.req = req;
	}
	
	
	
	
	
	
	


}
