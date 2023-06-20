package com.miCL1maven.hotel;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Huesped {
	@Id
	 private int codigoHuesped;
	    private String nombre;
	    private String email;
	    private String direccion;
	    private String telefono;

	    public Huesped() {
	        // Constructor vacio
	    }
	    // Constructor con parametros
	    public Huesped(int codigoHuesped, String nombre, String email, String direccion, String telefono) {
	        this.codigoHuesped = codigoHuesped;
	        this.nombre = nombre;
	        this.email = email;
	        this.direccion = direccion;
	        this.telefono = telefono;
	    }

	    // Getters y Setters
	    public int getCodigoHuesped() {
	        return codigoHuesped;
	    }

	    public void setCodigoHuesped(int codigoHuesped) {
	        this.codigoHuesped = codigoHuesped;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }

}
