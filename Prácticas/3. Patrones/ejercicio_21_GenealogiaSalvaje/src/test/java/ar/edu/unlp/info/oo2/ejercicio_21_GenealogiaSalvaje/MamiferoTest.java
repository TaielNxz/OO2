package ar.edu.unlp.info.oo2.ejercicio_21_GenealogiaSalvaje;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
	
	private RealMamifero mamifero;
	private RealMamifero padre;
	private RealMamifero madre;
	private RealMamifero abueloMaterno;
	private RealMamifero abuelaMaterna;
	private RealMamifero abueloPaterno;
	private RealMamifero abuelaPaterna;
	private NullMamifero nullMamifero;

	@BeforeEach
	void setUp() {
		abueloMaterno = new RealMamifero("abueloMaterno", "especie", LocalDate.of(2000, 1, 1));
		abuelaMaterna = new RealMamifero("abuelaMaterna", "especie", LocalDate.of(2002, 1, 1));
		abueloPaterno = new RealMamifero("abueloPaterno", "especie", LocalDate.of(2000, 1, 1));
		abuelaPaterna = new RealMamifero("abuelaPaterna", "especie", LocalDate.of(2002, 1, 1));	
		
		madre = new RealMamifero("madre", "Canis lupus", LocalDate.of(2020, 1, 1), abuelaMaterna, abueloMaterno);
		padre = new RealMamifero("padre", "Canis lupus", LocalDate.of(2020, 1, 1), abuelaPaterna, abueloPaterno);	
		
		mamifero = new RealMamifero("hijo", "Canis lupus", LocalDate.of(2000, 1, 1), madre, padre);
		nullMamifero = new NullMamifero();
	}

	@Test
	void testGetIdentificador() {
		assertEquals("hijo", mamifero.getIdentificador());
	}

	@Test
	void testSetIdentificador() {
		mamifero.setIdentificador("nuevoIdentificador");
		assertEquals("nuevoIdentificador", mamifero.getIdentificador());
	}

	@Test
	void testGetEspecie() {
		assertEquals("Canis lupus", mamifero.getEspecie());
	}

	@Test
	void testSetEspecie() {
		mamifero.setEspecie("Canis lupus familiaris");
		assertEquals("Canis lupus familiaris", mamifero.getEspecie());
	}

	@Test
	void testGetFechaDeNacimiento() {
		assertEquals(LocalDate.of(2000, 1, 1), mamifero.getFechaDeNacimiento());
	}

	@Test
	void testSetFechaDeNacimiento() {
		mamifero.setFechaDeNacimiento(LocalDate.of(1999, 12, 31));
		assertEquals(LocalDate.of(1999, 12, 31), mamifero.getFechaDeNacimiento());
	}

	@Test
	void testGetPadre() {
		assertEquals(padre, mamifero.getPadre());
	}

	@Test
	void testSetPadre() {
		RealMamifero nuevoPadre = new RealMamifero("nuevoPadre", "Canis lupus", LocalDate.of(1975, 1, 1));
		mamifero.setPadre(nuevoPadre);
		assertEquals(nuevoPadre, mamifero.getPadre());
	}

	@Test
	void testGetMadre() {
		assertEquals(madre, mamifero.getMadre());
	}

	@Test
	void testSetMadre() {
		RealMamifero nuevaMadre = new RealMamifero("nuevaMadre", "Canis lupus", LocalDate.of(1975, 1, 1));
		mamifero.setMadre(nuevaMadre);
		assertEquals(nuevaMadre, mamifero.getMadre());
	}

	@Test
	void testGetAbueloMaterno() {
		assertEquals(abueloMaterno, mamifero.getAbueloMaterno());
	}

	@Test
	void testGetAbuelaMaterna() {
		assertEquals(abuelaMaterna, mamifero.getAbuelaMaterna());
	}

	@Test
	void testGetAbueloPaterno() {
		assertEquals(abueloPaterno, mamifero.getAbueloPaterno());
	}

	@Test
	void testGetAbuelaPaterna() {
		assertEquals(abuelaPaterna, mamifero.getAbuelaPaterna());
	}

	@Test
	void testTieneComoAncestroA() {
		assertTrue(mamifero.tieneComoAncestroA(abueloMaterno));
		assertTrue(mamifero.tieneComoAncestroA(abuelaPaterna));
		assertFalse(mamifero.tieneComoAncestroA(new RealMamifero("extranjero")));
	}

	@Test
	void testNullMamifero() {
		assertNull(nullMamifero.getIdentificador());
		assertNull(nullMamifero.getEspecie());
		assertNull(nullMamifero.getFechaDeNacimiento());
		assertNull(nullMamifero.getPadre());
		assertNull(nullMamifero.getMadre());
		assertNull(nullMamifero.getAbueloMaterno());
		assertNull(nullMamifero.getAbuelaMaterna());
		assertNull(nullMamifero.getAbueloPaterno());
		assertNull(nullMamifero.getAbuelaPaterna());
		assertFalse(nullMamifero.tieneComoAncestroA(mamifero));
	}
}
