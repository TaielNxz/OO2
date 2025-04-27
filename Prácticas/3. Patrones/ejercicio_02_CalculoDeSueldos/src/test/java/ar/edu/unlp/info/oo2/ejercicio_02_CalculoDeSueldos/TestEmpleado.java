package ar.edu.unlp.info.oo2.ejercicio_02_CalculoDeSueldos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEmpleado {

	Pasante pasante;
	Planta planta;
	Temporario temporario;
	
	
	@Test
	void testEmpleadoPasanteSinAdicional() {
		
		// Pasante( String nombre , int cantExamenes ) 
		pasante = new Pasante( "pasante" , 0 );
		
		// $ 20.000
		assertEquals( 20000 , pasante.sueldoBasico() );
		
		// $ 2.000 * cantExamenes
		assertEquals( 2000*0 , pasante.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 2600 , pasante.descuento() );
		
	}
	
	
	@Test
	void testEmpleadoPasanteConAdicional() {
		
		// Pasante( String nombre , int cantExamenes ) 
		pasante = new Pasante( "pasante" , 5 );
		
		// $ 20.000
		assertEquals( 20000 , pasante.sueldoBasico() );
		
		// $ 2.000 * cantExamenes
		assertEquals( 2000*5 , pasante.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 2600+500 , pasante.descuento() );
		
	}

	
	@Test
	void testEmpleadoPlantaCasadoSinAdicional() {
		
		// Planta( String nombre, boolean casado, int cantHijos, int antiguedad ) 
		planta = new Planta( "planta" , false , 0 , 0  );
		
		// $ 50.000
		assertEquals( 50000 , planta.sueldoBasico() );
		
		// $ 5.000 si esta casado,  
		// $ 2.000 por cada hijo, 
		// $ 2.000 por cada año de antigüedad 
		assertEquals( 0 , planta.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 6500 , planta.descuento() );
		
	}
	
	
	@Test
	void testEmpleadoPlantaCasadoConAdicional() {
		
		// Planta( String nombre, boolean casado, int cantHijos, int antiguedad ) 
		planta = new Planta( "planta" , true , 1 , 5 );
		
		// $ 50.000
		assertEquals( 50000 , planta.sueldoBasico() );
		
		// $ 5.000 si esta casado,  
		// $ 2.000 por cada hijo, 
		// $ 2.000 por cada año de antigüedad 
		assertEquals( 5000+2000+2000*5 , planta.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 6500+850 , planta.descuento() );
		
	}
	
	
	@Test
	void testEmpleadoTemporarioSolteroSinAdicional() {
		
		// Temporario( String nombre, boolean casado, int cantHijos, int cantHoras )
		temporario = new Temporario( "temporario" , false , 0 , 100 );	
		
		// $ 20.000 + ( cantidad de horas que trabajo * 300 )
		assertEquals( 20000+30000 , temporario.sueldoBasico() );
		
		// $ 5.000 si esta casado,  
		// $ 2.000 por cada hijo, 
		assertEquals( 0 , temporario.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 6500 , temporario.descuento() );
		
	}
	
	
	@Test
	void testEmpleadoTemporarioCasadoConAdicional() {
		
		// Temporario( String nombre, boolean casado, int cantHijos, int cantHoras )
		temporario = new Temporario( "temporario" , true , 3 , 100 );	
		
		// $ 20.000 + ( cantidad de horas que trabajo * 300 )
		assertEquals( 20000+30000 , temporario.sueldoBasico() );
		
		// $ 5.000 si esta casado,  
		// $ 2.000 por cada hijo, 
		assertEquals( 5000+2000*3 , temporario.sueldoAdicional() );
		
		// 13% del sueldo básico + 5% del sueldo adicional
		assertEquals( 6500+550 , temporario.descuento() );
		
	}

}
