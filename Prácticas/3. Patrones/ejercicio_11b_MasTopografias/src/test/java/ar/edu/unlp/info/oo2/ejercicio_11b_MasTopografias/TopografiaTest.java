package ar.edu.unlp.info.oo2.ejercicio_11b_MasTopografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaTest {
	
	private Topografia agua;
	private Topografia tierra;
	private Topografia pantano;
	private Topografia mixta1;
	private Topografia mixta2;
	private Topografia mixtaAux;
	
	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		mixta1 = new Mixta( new Agua() , new Tierra() , new Tierra() , new Agua() );
		mixtaAux = new Mixta( new Agua() , new Tierra() , new Tierra() , new Agua() );
		mixta2 = new Mixta( new Agua() , new Tierra() , new Tierra() , mixtaAux ); 	
	}

	
	@Test
	public void testGetProporcionAgua() {	
		assertEquals( 0.7 , pantano.getProporcionAgua() );
	}

	
	@Test
	public void testGetProporcionTierra() {	
		assertEquals( 0.30000000000000004 , pantano.getProporcionTierra() ); // no se porque chota pasa esto
	}
	
	
	@Test
	public void testIsEqualsPantano() {
		assertTrue( this.pantano.isEquals( new Pantano() ) );
		assertFalse( this.pantano.isEquals(agua) );
		assertFalse( this.pantano.isEquals(tierra) );
		assertFalse( this.pantano.isEquals(mixta1) );
		assertFalse( this.pantano.isEquals(mixta2) );
	}

}
