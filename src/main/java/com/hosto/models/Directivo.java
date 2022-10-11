package com.hosto.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Directivo implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_directivo;

	private String nombre;

	@OneToMany(mappedBy = "directivo",fetch = FetchType.LAZY)
	private List<Odc> odc;

	public Directivo() {

	}

	public Directivo(Integer id_directivo, String nombre, List<Odc> odc) {

		this.id_directivo = id_directivo;
		this.nombre = nombre;
		this.odc = odc;
	}

	public Integer getId_directivo() {
		return id_directivo;
	}

	public void setId_directivo(Integer id_directivo) {
		this.id_directivo = id_directivo;
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

	@Override
	public String toString() {
		return "Directivo [id_directivo=" + id_directivo + ", nombre=" + nombre + ", odc=" + odc + "]";
	}
	
	

}
