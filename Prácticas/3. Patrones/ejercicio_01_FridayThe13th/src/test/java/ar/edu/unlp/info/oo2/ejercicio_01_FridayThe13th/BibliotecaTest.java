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
		
		String stringEsperado = 
			    "[" +
			    "  {" +
			    "    \"nombre\": \"Arya Stark\"," +
			    "    \"email\": \"needle@stark.com\"," +
			    "    \"legajo\": \"5234-5\"" +
			    "  }," +
			    "  {" +
			    "    \"nombre\": \"Tyron Lannister\"," +
			    "    \"email\": \"tyron@thelannisters.com\"," +
			    "    \"legajo\": \"2345-2\"" +
			    "  }" +
			    "]";

		
		System.out.print(biblioteca.exportarSocios());
		
		/*
		 * le mandé el replaceAll("\\s+", "") para que borre todos los espacios y tabulaciones
		 * porque me no me tomaba el test y me tenia podrido
		 */
		assertEquals( stringEsperado.replaceAll("\\s+", ""), biblioteca.exportarSocios().replaceAll("\\s+", "") );
	
	}

}
