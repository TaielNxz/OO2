package ar.edu.unlp.info.oo2.ejercicio_11_AdministradorDeProyectos;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {

	private Proyecto proyecto;
	private Proyecto proyectoCostoNulo;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.proyecto = new Proyecto( "Proyecto 1" , LocalDate.of(2000,12,10) , LocalDate.of(2000,12,20) , "objetivo 1" , 10 , 1000 );
		this.proyectoCostoNulo = new Proyecto( "Proyecto Costo Nulo" , LocalDate.of(2000,12,10) , LocalDate.of(2000,12,20) , "objetivo 2" , 10 , 0 );
	}

	
	@Test
	public void testAprobarEtapa() {
		
		// EnConstruccion
		assertTrue( this.proyecto.getEtapa() instanceof EnContruccion );
		this.proyecto.aprobarEtapa();
		 assertTrue( this.proyecto.getEtapa() instanceof EnEvaluacion );
		
		// EnEvaluacion
	    assertTrue( this.proyecto.getEtapa() instanceof EnEvaluacion );
		this.proyecto.aprobarEtapa();
		assertTrue( this.proyecto.getEtapa() instanceof Confirmada );

		// Confirmada
		assertTrue( this.proyecto.getEtapa() instanceof Confirmada );
		this.proyecto.aprobarEtapa();
		assertTrue( this.proyecto.getEtapa() instanceof Confirmada );
		
		// EnConstruccion con costo nulo
		RuntimeException exception= assertThrows(RuntimeException.class, () -> {
            this.proyectoCostoNulo.aprobarEtapa();
        });
        String expectedErrorMessage = "El proyecto posee un costo de $0";
        assertEquals(expectedErrorMessage, exception.getMessage());
	}
	
	
	@Test
	public void testCostoDelProyecto() {	
		assertEquals( 100000,this.proyecto.costoDelProyecto() );
		assertEquals( 0,this.proyectoCostoNulo.costoDelProyecto() );
	}
	
	
	@Test
	public void testPrecioDelProyecto() {	
		assertEquals( 800000,this.proyecto.precioDelProyecto() );
		assertEquals( 0,this.proyectoCostoNulo.precioDelProyecto() );
	}
	
	
	@Test
	public void testCancelarProyecto() {
		this.proyecto.cancelarProyecto();
		assertEquals( "objetivo 1 (Cancelado)" , this.proyecto.getObjetivo() );
	}

}
