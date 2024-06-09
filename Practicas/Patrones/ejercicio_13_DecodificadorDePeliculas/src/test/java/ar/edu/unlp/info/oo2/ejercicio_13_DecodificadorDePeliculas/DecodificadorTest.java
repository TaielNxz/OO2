package ar.edu.unlp.info.oo2.ejercicio_13_DecodificadorDePeliculas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Year;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecodificadorTest {

	private Decodificador decodificador;
	private Pelicula thor;
	private Pelicula capitanAmerica;
	private Pelicula ironMan;
	private Pelicula dunkirk;
	private Pelicula rocky;
	private Pelicula rambo;
	

	@BeforeEach
	void setUp() throws Exception {
		
		// Instancias de peliculas
		this.thor = new Pelicula( "Thor" , Year.of(2007) , 7.9 );
		this.capitanAmerica = new Pelicula( "Capitan America" , Year.of(2016) , 7.8 );
		this.ironMan = new Pelicula( "Iron man", Year.of(2010) , 7.9 );
		this.dunkirk = new Pelicula( "Dunkirk" , Year.of(2017) , 7.9 );
		this.rocky = new Pelicula( "Rocky" , Year.of(1976) , 8.1 );
		this.rambo = new Pelicula( "Rambo" , Year.of(1979) , 7.8 );
		
		// Similares
		this.thor.agregarSimilar(capitanAmerica);
		this.thor.agregarSimilar(ironMan);
		this.capitanAmerica.agregarSimilar(ironMan);
		this.rocky.agregarSimilar(rambo);
		

		this.decodificador = new Decodificador();
		this.decodificador.agregarPelicula(thor);
		this.decodificador.agregarPelicula(capitanAmerica);
		this.decodificador.agregarPelicula(ironMan);
		this.decodificador.agregarPelicula(dunkirk);
		this.decodificador.agregarPelicula(rocky);
		this.decodificador.agregarPelicula(rambo);
		this.decodificador.agregarReproducida(thor);
		this.decodificador.agregarReproducida(rocky);
		
	}
	
	@Test
	void testObtenerSugerencias() {
		
		// SugerenciaNovedad
		assertTrue( this.decodificador.obtenerSugerencias().contains(dunkirk) );
		assertTrue( this.decodificador.obtenerSugerencias().contains(capitanAmerica) );
		assertTrue( this.decodificador.obtenerSugerencias().contains(ironMan) );
		
		// SugerenciaSimilaridad
		this.decodificador.setCriterioSugerencia(new SugerenciaSimilaridad());
		assertTrue( this.decodificador.obtenerSugerencias().contains(capitanAmerica) );
		assertTrue( this.decodificador.obtenerSugerencias().contains(ironMan) );
		
		// SugerenciaPuntaje
		this.decodificador.setCriterioSugerencia(new SugerenciaPuntaje());
		assertTrue(this.decodificador.obtenerSugerencias().contains(capitanAmerica));
		assertTrue(this.decodificador.obtenerSugerencias().contains(ironMan));
		assertTrue(this.decodificador.obtenerSugerencias().contains(dunkirk));

	}

}
