package ar.edu.unlp.info.oo2.ejercicio_14_PrestamosPrendarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PrendaCombinadaTest {

    @Test
    void testValorYValorPrendarioDePrendaCombinada() {
    	
        Automovil auto = new Automovil("Toyota Corolla", 30000, 25000, 2020);
        Alquiler alquiler = new Alquiler(LocalDate.of(2024, 6, 1), LocalDate.of(2026, 6, 1), 500);

        PrendaCombinada prendaCombinada = new PrendaCombinada();
        prendaCombinada.agregarPrenda(auto);
        prendaCombinada.agregarPrenda(alquiler);

        double valorTotal = prendaCombinada.valor();
        double valorPrendario = prendaCombinada.valorPrendario();

        assertEquals( 19000, valorTotal );
        assertEquals( 9500, valorPrendario );
    }
}
