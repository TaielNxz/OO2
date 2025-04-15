package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExcursionesTest {

	private Excursion excursion;
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;
	
	@BeforeEach
	void setUp() throws Exception {
		
		// Instancias...
		// Excursion( nombre, fechaInicio, fechaFin  puntoEncuentro, costo, cupoMinimo, cupoMaximo )
		this.excursion = new Excursion( "Dos días en kayak bajando el Paraná" , LocalDate.of(2000,12,1) , LocalDate.of(2000,12,8) , "Punto de encuentro 1" , 1000 , 1 , 2 );
		this.usuario1 = new Usuario( "nombre1" , "apellido1" , "mail1@hotmail.com" );
		this.usuario2 = new Usuario( "nombre2" , "apellido2" , "mail2@hotmail.com" );
		
	}

	
	@Test
	public void testConsola() {
		
		// Ver en consola...
		System.out.println( this.excursion.obtenerInformacion() + '\n' );
		this.excursion.inscribirUsuario(usuario1);
		System.out.println( this.excursion.obtenerInformacion()  + '\n' );
		this.excursion.inscribirUsuario(usuario2);
		System.out.println( this.excursion.obtenerInformacion() + '\n'  );
		
	}
	
	
	@Test
	public void testEstado() {
		// comienza en "Provisoria"
		assertTrue( excursion.getEstado() instanceof Provisoria );
		// cambia a "Definitiva"
		excursion.inscribirUsuario(usuario1);	
		assertTrue( excursion.getEstado() instanceof Definitiva );
		// cambia a "Completa"
		excursion.inscribirUsuario(usuario2);
		assertTrue( excursion.getEstado() instanceof Completa );
	}
	
	
	@Test
	public void testInscribirUsuario() {
		excursion.inscribirUsuario(usuario1);
		assertEquals( 1 , excursion.getInscriptos().size() );
		excursion.inscribirUsuario(usuario2);
		assertEquals( 2 , excursion.getInscriptos().size() );
	}

	 @Test
	 public void testObtenerInformacion() {	 

			/*  
			 *  String esperado de una excursion con State 'Provisoria'
		 	 *  
		 	 *  Si la excursión no alcanza el cupo mínimo, la información es la siguiente: nombre,
		 	 *  costo, fechas, punto de encuentro, cantidad de usuarios faltantes para alcanzar el
		 	 *  cupo mínimo.
		 	*/
		 	String expectedInfo1 = "Nombre de la excursion: Dos días en kayak bajando el Paraná\n" +
	                                "Costo: 1000.0\n" +
	                                "Fecha de inicio: 2000-12-01\n" +
	                                "Fecha de fin: 2000-12-08\n" +
	                                "Punto de encuentro: Punto de encuentro 1\n" +
	                                "Faltantes para el cupo minimo: 1";
	        assertEquals(expectedInfo1, excursion.obtenerInformacion());

	        
	        // agregamos un usuario	        
	        this.excursion.inscribirUsuario(usuario1);
	        
	        
			/*  
			 *  String esperado de una excursion con State 'Definitiva'
			 *  
			 *  Si la excursión alcanzó el cupo mínimo pero aún no el máximo, la información es la
			 *  siguiente: nombre, costo, fechas, punto de encuentro, los mails de los usuarios
			 *  inscriptos y cantidad de usuarios faltantes para alcanzar el cupo máximo.
		 	*/
	        String expectedInfo2 = "Nombre de la excursion: Dos días en kayak bajando el Paraná\n" +
	                                "Costo: 1000.0\n" +
	                                "Fecha de inicio: 2000-12-01\n" +
	                                "Fecha de fin: 2000-12-08\n" +
	                                "Punto de encuentro: Punto de encuentro 1\n" +
	                                "Faltantes para el cupo minimo: 0\n" +
	                                "Mails de los usuarios inscriptos: mail1@hotmail.com";
	        assertEquals(expectedInfo2, excursion.obtenerInformacion());

	        
	        // agregamos otro usuario	        
	        this.excursion.inscribirUsuario(usuario2);
	        
	        
			/*  
			 *  String esperado de una excursion con State 'Completa'
			 *  
			 *  Si la excursión alcanzó el cupo máximo, la información solamente incluye nombre,
			 *  costo, fechas y punto de encuentro
		 	*/ 
	        String expectedInfo3 = "Nombre de la excursion: Dos días en kayak bajando el Paraná\n" +
	                                "Costo: 1000.0\n" +
	                                "Fecha de inicio: 2000-12-01\n" +
	                                "Fecha de fin: 2000-12-08\n" +
	                                "Punto de encuentro: Punto de encuentro 1\n";
	        assertEquals(expectedInfo3, excursion.obtenerInformacion());
	    }
	
}
