package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles.politica_de_cancelacion;

import java.time.LocalDate;

import ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles.Reserva;

public interface PoliticaCancelacion {
	
    double calcularReembolso(Reserva reserva, LocalDate fechaCancelacion);
    
}
