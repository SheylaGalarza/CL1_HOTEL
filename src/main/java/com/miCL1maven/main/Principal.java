package com.miCL1maven.main;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	import com.miCL1maven.hotel.*;

	public class Principal {

		public static void main(String[] args) {
			
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestPersistence");	
			EntityManager em = emf.createEntityManager();
			
			  // Código para buscar por el código de la reservacion  y mostrar los datos
	        int codigoReserva = 2; // Código de reserva

	        Reservacion reservacion = em.find(Reservacion.class, codigoReserva);
	        
	        if (reservacion != null) {
	            // Datos ingresados
	            System.out.println("Datos de la Reserva:");
	            System.out.println("Código de Reserva: " + reservacion.getCodigoReserva());
	            System.out.println("Código de Hotel: " + reservacion.getCodigoHotel());
	            System.out.println("Código de Huésped: " + reservacion.getCodigoHuesped());
	            System.out.println("Código de Habitación: " + reservacion.getCodigoHabitacion());
	            System.out.println("Fecha de Inicio: " + reservacion.getFechaInicio());
	            System.out.println("Fecha de Fin: " + reservacion.getFechaFin());
	        } else {
	        	
	            // No se encontró la reservacion EN HOTEL SU CARNET
	            System.out.println("No se encontró la reservacion en la BD");
	        }

	        em.close();
	        emf.close();
		}
}
