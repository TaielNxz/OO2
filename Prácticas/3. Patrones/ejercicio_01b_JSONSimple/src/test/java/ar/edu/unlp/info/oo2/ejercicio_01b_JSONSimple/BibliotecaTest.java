package ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple;

import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_01b_JSONSimple.adapters.*;

public class BibliotecaTest {

    Biblioteca biblioteca;
    String salidaEsperada;

    @BeforeEach
    void setUp() {
    	
        biblioteca = new Biblioteca();
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));

		salidaEsperada = 
				  "[                                              	\n"
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
				+ "]";
    }

    @Test
    void testJsonSimpleVoorheesAdapter() throws ParseException {
        biblioteca.setExporter(new JSONSimpleVoorheesAdapter());

        JSONParser parser = new JSONParser();
        assertEquals(
                parser.parse(salidaEsperada),
                parser.parse(biblioteca.exportarSocios())
        );
    }

    @Test
    void testJacksonVoorheesAdapter() throws ParseException {
        biblioteca.setExporter(new JacksonVoorheesAdapter());

        JSONParser parser = new JSONParser();
        assertEquals(
                parser.parse(salidaEsperada),
                parser.parse(biblioteca.exportarSocios())
        );
    }

}

