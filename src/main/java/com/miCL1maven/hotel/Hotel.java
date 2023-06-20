package com.miCL1maven.hotel;


	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Hotel {
		@Id
		private String codigoHotel;
	    private String nombre;
	    private String direccion;
	    private String sitioWeb;
	    
	    public Hotel() {
	        // Constructor vacio 
	    }
	    // Constructor con parametros
	    public Hotel(String codigoHotel, String nombre, String direccion, String sitioWeb) {
	        this.codigoHotel = codigoHotel;
	        this.nombre = nombre;
	        this.direccion = direccion;
	        this.sitioWeb = sitioWeb;
	    }

	    // Getters y Setters
	    public String getCodigoHotel() {
	        return codigoHotel;
	    }

	    public void setCodigoHotel(String codigoHotel) {
	        this.codigoHotel = codigoHotel;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getDireccion() {
	        return direccion;
	    }

	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }

	    public String getSitioWeb() {
	        return sitioWeb;
	    }

	    public void setSitioWeb(String sitioWeb) {
	        this.sitioWeb = sitioWeb;
	    }

}//fin de la clase
