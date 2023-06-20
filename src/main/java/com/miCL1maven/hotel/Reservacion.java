package com.miCL1maven.hotel;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Reservacion {
	@Id
	private int codigoReserva;
    private String codigoHotel;
    private int codigoHuesped;
    private int codigoHabitacion;
    private Date fechaInicio;
    private Date fechaFin;
    
    public Reservacion() {
        // Constructor vacio
    }
    // Constructor con parametros
    public Reservacion(int codigoReserva, String codigoHotel, int codigoHuesped, int codigoHabitacion, Date fechaInicio, Date fechaFin) {
        this.codigoReserva = codigoReserva;
        this.codigoHotel = codigoHotel;
        this.codigoHuesped = codigoHuesped;
        this.codigoHabitacion = codigoHabitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters
    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(String codigoHotel) {
        this.codigoHotel = codigoHotel;
    }

    public int getCodigoHuesped() {
        return codigoHuesped;
    }

    public void setCodigoHuesped(int codigoHuesped) {
        this.codigoHuesped = codigoHuesped;
    }

    public int getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(int codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    //obterner Datos de la Reservacion
    
    public String obtenerDatosReserva() {
        return "Código de Reserva: " + codigoReserva +
                "\nCódigo de Hotel: " + codigoHotel +
                "\nCódigo de Huésped: " + codigoHuesped +
                "\nCódigo de Habitación: " + codigoHabitacion +
                "\nFecha de Inicio: " + fechaInicio.toString() +
                "\nFecha de Fin: " + fechaFin.toString();
    }

}//fin de la clase Reservacion
