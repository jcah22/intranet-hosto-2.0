package com.hosto.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Odc implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_odc;

	private String descripcion;

	private String factura;

	private Date fecha;

	private Boolean flete;

	private Double total;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "req_id")
	private Req req;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id")
	private Status status;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "directivo_id")
	private Directivo directivo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cfdi_id")
	private Cfdi cfdi;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "area_id")
	private Area area;

	public Odc() {

	}

	public Odc(Integer id_odc, String descripcion, String factura, Date fecha, Boolean flete, Double total, Req req,
			Status status, Directivo directivo, Cfdi cfdi, Usuario usuario, Area area) {

		this.id_odc = id_odc;
		this.descripcion = descripcion;
		this.factura = factura;
		this.fecha = fecha;
		this.flete = flete;
		this.total = total;
		this.req = req;
		this.status = status;
		this.directivo = directivo;
		this.cfdi = cfdi;
		this.usuario = usuario;
		this.area = area;
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

	public Req getReq() {
		return req;
	}

	public void setReq(Req req) {
		this.req = req;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Directivo getDirectivo() {
		return directivo;
	}

	public void setDirectivo(Directivo directivo) {
		this.directivo = directivo;
	}

	public Cfdi getCfdi() {
		return cfdi;
	}

	public void setCfdi(Cfdi cfdi) {
		this.cfdi = cfdi;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Odc [id_odc=" + id_odc + ", descripcion=" + descripcion + ", factura=" + factura + ", fecha=" + fecha
				+ ", flete=" + flete + ", total=" + total + ", req=" + req + ", status=" + status + ", directivo="
				+ directivo + ", cfdi=" + cfdi + ", usuario=" + usuario + ", area=" + area + "]";
	}
	
	

}
