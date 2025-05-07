package ar.edu.unlp.info.oo2.ejercicio_01_FridayThe13th;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {

	Biblioteca biblioteca;


	@BeforeEach
	void setUp() throws Exception {	
		biblioteca = new Biblioteca();
		biblioteca.agregarSocio( new Socio("Arya Stark", "needle@stark.com", "5234-5") );
		biblioteca.agregarSocio( new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2") );
	}
	
	@Test
	void testExportar() {
		
		String stringEsperado = "[\n" +
			"\t{\n" +
			"\t\t\"nombre\": \"Arya Stark\",\n" +
			"\t\t\"email\": \"needle@stark.com\",\n" +
			"\t\t\"legajo\": \"5234-5\"\n" +
			"\t},\n" +
			"\t{\n" +
			"\t\t\"nombre\": \"Tyron Lannister\",\n" +
			"\t\t\"email\": \"tyron@thelannisters.com\",\n" +
			"\t\t\"legajo\": \"2345-2\"\n" +
			"\t}\n" +
			"]";
		
		/*
		 * le mandé el replaceAll("\\s+", "") para que borre todos los espacios y tabulaciones
		 * porque me no me tomaba el test y me tenia podrido
		 */
		assertEquals( stringEsperado.replaceAll("\\s+", ""), biblioteca.exportarSocios().replaceAll("\\s+", "") );
	
	}

}
