package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles.politica_de_cancelacion.PoliticaFlexible;
import ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles.politica_de_cancelacion.PoliticaModerada;

import java.time.LocalDate;

public class PoliticaCancelacionTest {

    @Test
    void testCambioDePoliticaDeCancelacion() {
    	
        // Crear automóvil con política flexible
        AutoEnAlquiler auto = new AutoEnAlquiler(100.0, 4, "Toyota");
        auto.setPoliticaCancelacion(new PoliticaFlexible());

        // Crear reserva para ese auto
        LocalDate fechaReserva = LocalDate.of(2025, 5, 20);
        Usuario usuarioReserva = new Usuario("Taiel");
        Reserva reserva = new Reserva(auto, usuarioReserva, 5, fechaReserva);  // 5 días de alquiler
        
        // Calcular reembolso con política flexible
        LocalDate fechaCancelacion = LocalDate.of(2025, 5, 10); // 10 de mayo (antes de la reserva)
        double reembolso = reserva.montoAReembolsar(fechaCancelacion);
        
        // Chusmear...
        System.out.println("Reembolso con política flexible: " + reembolso);
        assertEquals(500.0, reembolso); // 5 días * $100

        
        // Cambiar política a moderada
        auto.setPoliticaCancelacion(new PoliticaModerada());
        
        // Recalcular reembolso
        double reembolsoModerado = reserva.montoAReembolsar(fechaCancelacion);

        // Chusmear...
        System.out.println("Reembolso con política moderada: " + reembolsoModerado);
        assertEquals(500.0, reembolsoModerado); // Más de 7 días antes → reembolso total
        
    }
}
