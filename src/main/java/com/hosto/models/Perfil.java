package com.hosto.models;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Perfil {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String perfil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", perfil=" + perfil + "]";
	}
    
}
