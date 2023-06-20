package com.miCL1maven.main;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.miCL1maven.hotel.Hotel;
import com.miCL1maven.hotel.Habitacion;
import com.miCL1maven.hotel.Huesped;
import com.miCL1maven.hotel.Reservacion;

public class PrincipalInsertar {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");	
		EntityManager em = emf.createEntityManager();
		
		 // Crear un objeto Hotel con datos
		
        Hotel hotel = new Hotel();
        hotel.setCodigoHotel("H001");
        hotel.setNombre("Hotel A");
        hotel.setDireccion("Calle Principal 123");
        hotel.setSitioWeb("www.hotela.com");
        
        // Crear un objeto Habitacion - insertar datos
        Habitacion habitacion = new Habitacion();
        habitacion.setCodigoHabitacion(100);
        habitacion.setCodigoHotel("H001");
        habitacion.setTipo("Individual");
        habitacion.setPrecio(100);
        
     // Crear un objeto Huesped con los datos a insertar
        Huesped huesped = new Huesped();
        huesped.setCodigoHuesped(3);
        huesped.setNombre("Carlos Gòmez");
        huesped.setEmail("carlos@example.com");
        huesped.setDireccion("Plaza Mayor 789");
        huesped.setTelefono("4567890123");
        
     // Crear un objeto Reservacion con los datos a insertar
        Reservacion reservacion = new Reservacion();
        reservacion.setCodigoReserva(4001);
        reservacion.setCodigoHotel("H001");
        reservacion.setCodigoHuesped(3);
        reservacion.setCodigoHabitacion(100);
     // Ingresar las fechas 
        java.util.Date fechaInicio = new java.util.Date();
        java.util.Date fechaFin = new java.util.Date();
        reservacion.setFechaInicio(fechaInicio);
        reservacion.setFechaFin(fechaFin);
        
        // Iniciar la transacción
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Insertar el objeto Hotel en BD HOTEL_SUCARNET
        em.persist(hotel);
        // Insertar el objeto Habitacion en DB HOTEL_SUCARNET
        em.persist(habitacion);
     // Insertar el objeto Huesped en BD HOTEL_SUCARNET
        em.persist(huesped);
        // Insertar el objeto Reservacion en BD HOTEL_SUCARNET
        em.persist(reservacion);

        
        tx.commit();

        System.out.println("Datos del Hotel insertado:");
        System.out.println("Código de Hotel: " + hotel.getCodigoHotel());
        System.out.println("Nombre: " + hotel.getNombre());
        System.out.println("Dirección: " + hotel.getDireccion());
        System.out.println("Sitio Web: " + hotel.getSitioWeb());
        
        System.out.println("Datos de la Habitación insertada:");
        System.out.println("Código de Habitación: " + habitacion.getCodigoHabitacion());
        System.out.println("Código de Hotel: " + habitacion.getCodigoHotel());
        System.out.println("Tipo: " + habitacion.getTipo());
        System.out.println("Precio: " + habitacion.getPrecio());
        
        System.out.println("Datos del Huesped insertado:");
        System.out.println("Código de Huesped: " + huesped.getCodigoHuesped());
        System.out.println("Nombre: " + huesped.getNombre());
        System.out.println("Email: " + huesped.getEmail());
        System.out.println("Dirección: " + huesped.getDireccion());
        System.out.println("Teléfono: " + huesped.getTelefono());
        
        System.out.println("Datos de la Reservacion insertada:");
        System.out.println("Código de Reserva: " + reservacion.getCodigoReserva());
        System.out.println("Código de Hotel: " + reservacion.getCodigoHotel());
        System.out.println("Código de Huesped: " + reservacion.getCodigoHuesped());
        System.out.println("Código de Habitacion: " + reservacion.getCodigoHabitacion());
        System.out.println("Fecha de Inicio: " + reservacion.getFechaInicio());
        System.out.println("Fecha de Fin: " + reservacion.getFechaFin());

        em.close();
        emf.close();
        
	}

}//fin de la clase principal insertar
