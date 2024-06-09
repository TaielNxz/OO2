package ar.edu.unlp.info.oo2.ejercicio_02_PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTest {

	Piedra piedra;
	Papel papel;
	Tijera tijera;
	Lagarto lagarto;
	Spock spock;
	
	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		lagarto = new Lagarto();
		spock = new Spock();
	}

	@Test
	void testContraPiedra() {
        assertEquals("Empate", piedra.jugarContra(piedra));
        assertEquals("Gana Papel", piedra.jugarContra(papel));
        assertEquals("Pierde Tijera", piedra.jugarContra(tijera));
        assertEquals("Pierde Lagarto", piedra.jugarContra(lagarto));
        assertEquals("Gana Spock", piedra.jugarContra(spock));
	}

}
