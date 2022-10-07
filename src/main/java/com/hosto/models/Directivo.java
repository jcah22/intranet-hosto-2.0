package com.hosto.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Directivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_directivo;
	
	private String nombre;
	
	
	
	

}
