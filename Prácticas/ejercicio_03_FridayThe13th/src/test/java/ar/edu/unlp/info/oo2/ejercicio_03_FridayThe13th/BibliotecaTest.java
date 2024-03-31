package ar.edu.unlp.info.oo2.ejercicio_03_FridayThe13th;

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
		System.out.println( biblioteca.exportarSocios() );
	}

	

}
