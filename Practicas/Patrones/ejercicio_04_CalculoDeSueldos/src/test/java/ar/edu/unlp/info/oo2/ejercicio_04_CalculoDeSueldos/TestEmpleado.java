package ar.edu.unlp.info.oo2.ejercicio_04_CalculoDeSueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEmpleado {

	Pasante pasante;
	Planta planta;
	Temporario temporario;
	
	
	@Test
	void testEmpleadoPasante() {
		
		// Pasante( String nombre , boolean casado, int cantHijos, int cantExamenes ) 
		pasante = new Pasante( "pasante" , 0 );
		
		// $ 20.000
		assertEquals( 20000 , pasante.sueldoBasico() );
		
		// $ 2.000 * cant examenes
		assertEquals( 2000*5 , pasante.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 2600+500 , pasante.descuento() );
		
	}
	
	
	@Test
	void testEmpleadoPlanta() {
		
		// Planta( String nombre, boolean casado, int cantHijos, int antiguedad ) 
		planta = new Planta( "planta" , true , 1 , 5 );
		
		// $ 50.000
		assertEquals( 50000 , planta.sueldoBasico() );
		
		// $ 5.000 si esta casado,  
		// $ 2.000 por cada hijo,   
		// $ 2.000 por cada año de antigüedad
		assertEquals( 5000+2000+10000 , planta.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 6500+850 , planta.descuento() );
		
	}
	
	
	@Test
	void testEmpleadoTemporario() {
		
		// Temporario( String nombre, boolean casado, int cantHijos, int cantHoras )
		temporario = new Temporario( "temporario" , false , 2 , 10 );	
		
		// $ 20.000 + ( cantidad de horas que trabajo * 300 )
		assertEquals( 20000+3000 , temporario.sueldoBasico() );
		
		// $ 5.000 si esta casado,  
		// $ 2.000 por cada hijo, 
		assertEquals( 4000 , temporario.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 2990+200 , temporario.descuento() );
		
	}

}
