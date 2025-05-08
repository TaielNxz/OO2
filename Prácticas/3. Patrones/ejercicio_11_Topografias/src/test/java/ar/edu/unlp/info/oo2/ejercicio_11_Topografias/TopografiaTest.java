package ar.edu.unlp.info.oo2.ejercicio_11_Topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaTest {

	private Topografia agua;
	private Topografia tierra;
	private Topografia mixta1;
	private Topografia mixta2;
	private Topografia mixtaAux;

	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		mixta1 = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
		mixtaAux = new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua());
		mixta2 = new Mixta(new Agua(), new Tierra(), new Tierra(), mixtaAux);
	}

	// Verifica proporción de agua
	@Test
	public void testGetProporcionAgua() {
		assertEquals(1, agua.getProporcionAgua());
		assertEquals(0, tierra.getProporcionAgua());
		assertEquals(0.5, mixta1.getProporcionAgua());
		assertEquals(0.375, mixta2.getProporcionAgua());
	}

	// Verifica proporción de tierra
	@Test
	public void testGetProporcionTierra() {
		assertEquals(0, agua.getProporcionTierra());
		assertEquals(1, tierra.getProporcionTierra());
		assertEquals(0.5, mixta1.getProporcionTierra());
		assertEquals(0.625, mixta2.getProporcionTierra());
	}

	// Compara igualdad entre instancias de Agua
	@Test
	public void testIsEqualsAgua() {
		assertTrue(agua.equals(new Agua()));
		assertFalse(agua.equals(tierra));
		assertFalse(agua.equals(mixta1));
		assertFalse(agua.equals(mixta2));
	}

	// Compara igualdad entre instancias de Tierra
	@Test
	public void testIsEqualsTierra() {
		assertTrue(tierra.equals(new Tierra()));
		assertFalse(tierra.equals(agua));
		assertFalse(tierra.equals(mixta1));
		assertFalse(tierra.equals(mixta2));
	}

	// Compara igualdad entre topografías mixtas
	@Test
	public void testIsEqualsMixta() {
		assertTrue(mixta1.equals(new Mixta(new Agua(), new Tierra(), new Tierra(), new Agua())));
		assertFalse(mixta1.equals(agua));
		assertFalse(mixta1.equals(tierra));
		assertFalse(mixta1.equals(mixta2));
		assertTrue(mixta2.equals(new Mixta(new Agua(), new Tierra(), new Tierra(), mixtaAux)));
		assertFalse(mixta2.equals(agua));
		assertFalse(mixta2.equals(tierra));
		assertFalse(mixta2.equals(mixta1));
	}
}
