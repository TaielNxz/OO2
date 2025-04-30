package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaCancelacion {
	
	/*
	 * Si el automóvil tiene política de cancelación flexible, 
	 * se reembolsará el monto total sin importar la fecha de cancelación 
	 * (que de todas maneras debe ser anterior a la fecha de inicio de la reserva). 
	*/
	public double calcularReembolso(Reserva reserva, LocalDate fechaCancelacion) {
        return reserva.montoAPagar();
    }
    
}