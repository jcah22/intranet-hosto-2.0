package com.hosto.models;

import javax.persistence.Entity;

@Entity
public class Proveedor {

    private Long id_proveedor;

    private String nombre;

    private String direccion;

    private String telefono;

    private String factura;

    private String rfc;
    
}
