package ar.edu.unlp.info.oo2.ejercicio_03b_JSONSimple;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BibliotecaTest {

	Biblioteca biblioteca;
	JSONParser parser;


	@BeforeEach
	void setUp() throws Exception {
		
		parser = new JSONParser();
		
		biblioteca = new Biblioteca();
		
		biblioteca.agregarSocio( new Socio("Arya Stark", "needle@stark.com", "5234-5") );
		
		biblioteca.agregarSocio( new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2") ); 
		
	}
	
	
	@Test
	void testJSONSimple() throws ParseException {
		
		VoorheesExporter adapter = new JSONSimpleAdapter();
		
		String salida =   "[                              		  	        \n"
						+ "    {										    \n"
						+ "        \"nombre\": \"Arya Stark\",              \n"
						+ "		   \"email\": \"needle@stark.com\",         \n"
						+ "		   \"legajo\": \"5234-5\"                   \n"
						+ "	   },										    \n"
						+ "	   {									        \n"
						+ "		   \"nombre\": \"Tyron Lannister\",		    \n"
						+ "		   \"email\": \"tyron@thelannisters.com\",  \n"
						+ "		   \"legajo\": \"2345-2\"				    \n"
						+ "	   }											\n"
						+ "]												  ";
				
		biblioteca.setExporter(adapter);
		
		assertEquals( parser.parse(salida) , parser.parse(this.biblioteca.exportarSocios()) );
		
	}

	
	@Test
	void testJackson() throws ParseException {
		
		VoorheesExporter adapter = new JacksonAdapter();
		
		String salida =   "[                              		  	        \n"
						+ "    {										    \n"
						+ "        \"nombre\": \"Arya Stark\",              \n"
						+ "		   \"email\": \"needle@stark.com\",         \n"
						+ "		   \"legajo\": \"5234-5\"                   \n"
						+ "	   },										    \n"
						+ "	   {									        \n"
						+ "		   \"nombre\": \"Tyron Lannister\",		    \n"
						+ "		   \"email\": \"tyron@thelannisters.com\",  \n"
						+ "		   \"legajo\": \"2345-2\"				    \n"
						+ "	   }											\n"
						+ "]												  ";
				
		biblioteca.setExporter(adapter);
		
		assertEquals( parser.parse(salida) , parser.parse(this.biblioteca.exportarSocios()) );
		
	}
	

}
