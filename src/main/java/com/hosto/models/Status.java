package com.hosto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Status {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_status;
	
	private String nombre;
	
	@OneToMany(mappedBy = "status")
	private List<Odc> odc;

	public Status() {
	
	}

	public Status(Integer id_status, String nombre, List<Odc> odc) {
		this.id_status = id_status;
		this.nombre = nombre;
		this.odc = odc;
	}

	public Integer getId_status() {
		return id_status;
	}

	public void setId_status(Integer id_status) {
		this.id_status = id_status;
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
