package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import java.time.LocalDate;

public class PoliticaEstricta implements PoliticaCancelacion {
	
	/*
	 * Si el automóvil tiene política de cancelación estricta, 
	 * no se reembolsará nada (0, cero) sin importar la fecha tentativa de cancelación.  
	*/
    public double calcularReembolso(Reserva reserva, LocalDate fechaCancelacion) {
        return 0.0;
    }

}