package ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas;

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
	
	
	@Test
	void testObtenerSugerenciasPorNovedad() {
		// El filtrado deberia mostrar los mas recientes primero...
		// 1ro --> dunkirk (2017)
		// 2do --> capitanAmerica (2016)
		// 3ro --> ironMan (2010)
		assertEquals( dunkirk , this.decodificador.obtenerSugerencias().get(0) );
		assertEquals( capitanAmerica , this.decodificador.obtenerSugerencias().get(1) );
		assertEquals( ironMan , this.decodificador.obtenerSugerencias().get(2) );
	}
	
	
	@Test
	void testObtenerSugerenciasPorSimilaridad() {
		// El filtrado deberia mostrar los mas recientes primero...
		// 1ro --> capitanAmerica (2016)
		// 2do --> ironMan (2010)
		// 3ro --> rambo (1979)
		this.decodificador.setCriterioSugerencia(new SugerenciaSimilaridad());
		assertEquals( capitanAmerica , this.decodificador.obtenerSugerencias().get(0) );
		assertEquals( ironMan , this.decodificador.obtenerSugerencias().get(1) );
		assertEquals( rambo , this.decodificador.obtenerSugerencias().get(2) );
	}
	
	
	@Test
	void testObtenerSugerenciasPorPuntaje() {
		// El filtrado deberia mostrar los mas recientes primero, si son iguales ordena por año...
		// 1ro --> dunkirk (7.9)(2017)
		// 2do --> ironMan (7.9)(2010)
		// 3ro --> capitanAmerica (7.8)
		this.decodificador.setCriterioSugerencia(new SugerenciaPuntaje());
		assertEquals( dunkirk , this.decodificador.obtenerSugerencias().get(0) );
		assertEquals( ironMan , this.decodificador.obtenerSugerencias().get(1) );
		assertEquals( capitanAmerica , this.decodificador.obtenerSugerencias().get(2) );
	}
	
	
	@Test
	void testFueReproducida() {
		assertTrue( this.decodificador.fueReproducida(thor) );
		assertFalse( this.decodificador.fueReproducida(ironMan) );
	}
	
	
	@Test
	void testMostrarPeliculas() {
		String peliculas =  "Titulo: Thor\n" +
			                "Anio: 2007\n" +
			                "Puntaje: 7.9\n" +
			                "Titulo: Capitan America\n" +
			                "Anio: 2016\n" +
			                "Puntaje: 7.8\n" +
			                "Titulo: Iron man\n" +
			                "Anio: 2010\n" +
			                "Puntaje: 7.9\n" +
			                "Titulo: Dunkirk\n" +
			                "Anio: 2017\n" +
			                "Puntaje: 7.9\n" +
			                "Titulo: Rocky\n" +
			                "Anio: 1976\n" +
			                "Puntaje: 8.1\n" +
			                "Titulo: Rambo\n" +
			                "Anio: 1979\n" +
			                "Puntaje: 7.8";
		assertEquals( peliculas , this.decodificador.mostrarPeliculas() );
	}
	
	@Test
	void testMostrarReproducidas() {
		String reproducidas =  "Titulo: Thor\n" +
				               "Anio: 2007\n" +
				               "Puntaje: 7.9\n" +
				               "Titulo: Rocky\n" +
				               "Anio: 1976\n" +
				               "Puntaje: 8.1";
		assertEquals( reproducidas , this.decodificador.mostrarReproducidas() );
	}

}
