package com.hosto.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_usuario;
	
	private String  apellidoPaterno; 
	
	private String apellidoMaterno;
	
	private String nombres;
	
	private String correo;
	
	private Date fechaIngreso;
	
	private Date fechaNacimiento;
	
	private String foto;
	
	private String password;
	
	private Boolean status;
	
	private Integer telefono;
	
	private String username;
	

	
	
	
	

}
