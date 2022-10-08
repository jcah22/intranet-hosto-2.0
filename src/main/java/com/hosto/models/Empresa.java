package com.hosto.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_empresa;

	private String correo;

	private String direccion;

	private String imagen;

	private String nombre;

	private String rfc;

	private String telefono;

	@OneToMany(mappedBy = "empresa")
	private List<Req> reqs;

	public Empresa() {

	}

	public Empresa(Integer id_empresa, String correo, String direccion, String imagen, String nombre, String rfc,
			String telefono, List<Req> reqs) {

		this.id_empresa = id_empresa;
		this.correo = correo;
		this.direccion = direccion;
		this.imagen = imagen;
		this.nombre = nombre;
		this.rfc = rfc;
		this.telefono = telefono;
		this.reqs = reqs;
	}

	public Integer getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Integer id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Req> getReqs() {
		return reqs;
	}

	public void setReqs(List<Req> reqs) {
		this.reqs = reqs;
	}

}
