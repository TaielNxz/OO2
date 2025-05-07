package ar.edu.unlp.info.oo2.ejercicio_02_CalculoDeSueldos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestEmpleado {

	EmpleadoPasante pasante;
	EmpleadoPlanta planta;
	EmpleadoTemporario temporario;
	
	
	@Test
	void testEmpleadoPasanteSinAdicional() {
		// Pasante sin exámenes rendidos.
		pasante = new EmpleadoPasante("pasante", 0);

		// Sueldo básico fijo para pasantes: $20.000
		assertEquals(20000, pasante.sueldoBasico());

		// Sueldo adicional: $2000 por examen → 0 * 2000 = $0
		assertEquals(0, pasante.sueldoAdicional());

		// Descuento: 13% del básico + 5% del adicional → 13% de 20000 = 2600
		assertEquals(2600, pasante.descuento());
	}
	
	@Test
	void testEmpleadoPasanteConAdicional() {
		// Pasante con 5 exámenes rendidos
		pasante = new EmpleadoPasante( "pasante" , 5 );
		
		// $ 20.000 (sueldo básico fijo para pasantes)
		assertEquals( 20000 , pasante.sueldoBasico() );
		
		// 5 * 2000 = $10.000 adicional
		assertEquals(10000, pasante.sueldoAdicional());

		// Descuento: 2600 (13% de básico) + 500 (5% de adicional)
		assertEquals(3100, pasante.descuento());
	}

	
	@Test
	void testEmpleadoPlantaCasadoSinAdicional() {
		// Empleado de planta sin cónyuge, sin hijos ni antigüedad
		planta = new EmpleadoPlanta( "planta" , false , 0 , 0  );
		
		// $ 50.000 (sueldo básico fijo para empleado planta)
		assertEquals( 50000 , planta.sueldoBasico() );
		
		// Sin casamiento, hijos ni antigüedad: adicional = $0
		assertEquals(0, planta.sueldoAdicional());

		// Descuento: 13% de $50.000 = $6500
		assertEquals(6500, planta.descuento());
	}
	
	@Test
	void testEmpleadoPlantaCasadoConAdicional() {
		// Empleado de planta con cónyuge, 1 hijo y 5 años de antigüedad
		planta = new EmpleadoPlanta( "planta" , true , 1 , 5 );
		
		// $ 50.000 (sueldo básico fijo para empleado planta)
		assertEquals(50000, planta.sueldoBasico());

		// Adicional: $5000 (casado) + $2000 (1 hijo) + $10000 (5 años)
		assertEquals(17000, planta.sueldoAdicional());

		// Descuento: 6500 (13% básico) + 850 (5% adicional)
		assertEquals(7350, planta.descuento());
	}
	
	
	@Test
	void testEmpleadoTemporarioSolteroSinAdicional() {	
		// Temporario soltero sin hijos, trabaja 100 horas.
		temporario = new EmpleadoTemporario( "temporario" , false , 0 , 100 );	
		
		// Básico: $20.000 + $300 por hora → 20000 + 30000 = 50000
		assertEquals(50000, temporario.sueldoBasico());

		// Sin casamiento ni hijos: adicional = $0
		assertEquals(0, temporario.sueldoAdicional());

		// Descuento: 13% de 50000 = 6500
		assertEquals(6500, temporario.descuento());
	}
	
	
	void testEmpleadoTemporarioCasadoConAdicional() {
		// Temporario con cónyuge, 3 hijos, 100 horas trabajadas
		temporario = new EmpleadoTemporario("temporario", true, 3, 100);

		// básico: $20.000 + ($300 * 100 horas) = $50.000
		assertEquals(50000, temporario.sueldoBasico());

		// $5.000 (casado) + $2.000 * 3 hijos = $11.000
		assertEquals(5000 + 2000 * 3, temporario.sueldoAdicional());

		// 13% del básico + 5% del adicional = $6500 + $550 = $7050
		assertEquals(6500 + 550, temporario.descuento());
	}
	
	
	/*
	 * Test extra para chusmear directamente el metodo sueldo...
	 */
	@Test
	void testSueldoCompletoEmpleadoPlanta() {
		planta = new EmpleadoPlanta("planta", true, 1, 5);

		double basico = 50000;
		double adicional = 5000 + 2000 + (2000 * 5); // 17000
		double descuento = basico * 0.13 + adicional * 0.05; // 6500 + 850 = 7350
		double esperado = basico + adicional - descuento;

		assertEquals(esperado, planta.sueldo(), 0.01);
	}

}
