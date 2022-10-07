package com.hosto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cfdi {
	
	@Id
	@GeneratedValue
	private Integer id_cfdi;
	
	private String codigo;
	
	private String nombre;
	
	
	@OneToMany(mappedBy = "cfdi")
	private List<Odc> odc;


	public Cfdi() {
		
	}


	public Cfdi(Integer id_cfdi, String codigo, String nombre, List<Odc> odc) {
	
		this.id_cfdi = id_cfdi;
		this.codigo = codigo;
		this.nombre = nombre;
		this.odc = odc;
	}


	public Integer getId_cfdi() {
		return id_cfdi;
	}


	public void setId_cfdi(Integer id_cfdi) {
		this.id_cfdi = id_cfdi;
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


	public List<Odc> getOdc() {
		return odc;
	}


	public void setOdc(List<Odc> odc) {
		this.odc = odc;
	}
	
	
	
	
	
	
	
	
	
	
	

}
