package com.hosto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Req {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_req;

	private String codigo;

	private String nombre;

	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

	@OneToMany(mappedBy = "req")
	private List<Odc> odcs;

	public Req() {

	}

	public Req(Integer id_req, String codigo, String nombre, Empresa empresa, List<Odc> odcs) {
		super();
		this.id_req = id_req;
		this.codigo = codigo;
		this.nombre = nombre;
		this.empresa = empresa;
		this.odcs = odcs;
	}

	public Integer getId_req() {
		return id_req;
	}

	public void setId_req(Integer id_req) {
		this.id_req = id_req;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Odc> getOdcs() {
		return odcs;
	}

	public void setOdcs(List<Odc> odcs) {
		this.odcs = odcs;
	}

}
