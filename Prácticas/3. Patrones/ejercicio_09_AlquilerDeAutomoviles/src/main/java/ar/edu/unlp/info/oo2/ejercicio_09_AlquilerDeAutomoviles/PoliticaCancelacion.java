package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import java.time.LocalDate;

public interface PoliticaCancelacion {
	
    double calcularReembolso(Reserva reserva, LocalDate fechaCancelacion);
    
}
