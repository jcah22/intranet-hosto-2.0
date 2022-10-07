package com.hosto.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cfdi {
	
	@Id
	@GeneratedValue
	private Integer id_cfdi;
	
	private String codigo;
	
	private String nombre;
	
	
	

}
