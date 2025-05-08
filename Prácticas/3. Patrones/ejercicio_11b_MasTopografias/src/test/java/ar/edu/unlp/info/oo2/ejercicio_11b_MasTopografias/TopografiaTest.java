package ar.edu.unlp.info.oo2.ejercicio_11b_MasTopografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaTest {

	private Topografia agua;
	private Topografia tierra;
	private Topografia pantano;
	private Topografia mixta1;
	private Topografia mixta2;
	private Topografia mixtaAux;

	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		mixta1 = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
		mixtaAux = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
		mixta2 = new Mixta(new Agua(), new Tierra(), new Tierra(), mixtaAux);
	}

	// Verifica proporciones de agua para el pantano
	@Test
	public void testGetProporcionAguaPantano() {
		assertEquals(0.7, pantano.getProporcionAgua(), 0.0001);
	}

	// Verifica proporción de tierra para el pantano (1 - 0.7 = 0.3)
	@Test
	public void testGetProporcionTierraPantano() {
		assertEquals(0.3, pantano.getProporcionTierra(), 0.0001); // agrego un valor de "toleancia" 0.0001 para que no se rompa el test
	}

	// Compara igualdad del pantano con otras topografías
	@Test
	public void testEqualsPantano() {
		assertTrue(pantano.equals(new Pantano()));
		assertFalse(pantano.equals(agua));
		assertFalse(pantano.equals(tierra));
		assertFalse(pantano.equals(mixta1));
		assertFalse(pantano.equals(mixta2));
	}
}
