package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaCancelacion {
	
	/*
	 * Si el automóvil tiene política de cancelación moderada, 
	 * se reembolsará el monto total si la cancelación se hace hasta una semana antes 
	 * y 50% si se hace hasta 2 días antes.
	*/
    public double calcularReembolso(Reserva reserva, LocalDate fechaCancelacion) {
    	
        double diasAntes = ChronoUnit.DAYS.between(fechaCancelacion, reserva.getFecha());
        
        if (diasAntes >= 7) {
            return reserva.montoAPagar();
            
        } else if (diasAntes >= 2) {
            return reserva.montoAPagar() * 0.5;

        } else {
            return 0.0;
            
        }
        
    }

}

