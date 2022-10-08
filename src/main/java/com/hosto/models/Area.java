package com.hosto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Area {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_area;

	private String nombre;

	@OneToMany(mappedBy = "area")
	private List<Usuario> usuario;

	@OneToMany(mappedBy = "area")
	private List<Odc> odc;

	public Area() {

	}

	public Area(Integer id_area, String nombre, List<Usuario> usuario, List<Odc> odc) {
		this.id_area = id_area;
		this.nombre = nombre;
		this.usuario = usuario;
		this.odc = odc;
	}

	public Integer getId_area() {
		return id_area;
	}

	public void setId_area(Integer id_area) {
		this.id_area = id_area;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public List<Odc> getOdc() {
		return odc;
	}

	public void setOdc(List<Odc> odc) {
		this.odc = odc;
	}

}
