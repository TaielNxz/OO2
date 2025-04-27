package ar.edu.unlp.info.oo2.ejercicio_06_Topografias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TopografiaTest {
	
	private Topografia agua;
	private Topografia tierra;
	private Topografia mixta1;
	private Topografia mixta2;
	private Topografia mixtaAux;
	
	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		mixta1 = new Mixta( new Agua() , new Tierra() , new Tierra() , new Agua() );
		mixtaAux = new Mixta( new Agua() , new Tierra() , new Tierra() , new Agua() );
		mixta2 = new Mixta( new Agua() , new Tierra() , new Tierra() , mixtaAux ); 	
	}

	
	@Test
	public void testGetProporcionAgua() {	
		assertEquals( 1 , agua.getProporcionAgua() );
		assertEquals( 0 , tierra.getProporcionAgua() );
		assertEquals( 0.5 , mixta1.getProporcionAgua() );
		assertEquals( 0.375 , mixta2.getProporcionAgua() );
	}

	
	@Test
	public void testGetProporcionTierra() {	
		assertEquals( 0 , agua.getProporcionTierra() );
		assertEquals( 1 , tierra.getProporcionTierra() );
		assertEquals( 0.5 , mixta1.getProporcionTierra() );
		assertEquals( 0.625 , mixta2.getProporcionTierra() );
	}
	
	
	@Test
	public void testIsEqualsAgua() {
		assertTrue( this.agua.equals( new Agua() ) );
		assertFalse( this.agua.equals(tierra) );
		assertFalse( this.agua.equals(mixta1) );
		assertFalse( this.agua.equals(mixta2) );
	}
	
	
	@Test
	public void testIsEqualsTierra() {	
		assertTrue( this.tierra.equals(new Tierra()) );
		assertFalse( this.tierra.equals(agua) );
		assertFalse( this.tierra.equals(mixta1) );
		assertFalse( this.tierra.equals(mixta2) );
	}
	
	
	@Test
	public void testIsEqualsMixta() {	
		assertTrue( this.mixta1.equals( new Mixta( new Agua() , new Tierra() , new Tierra() , new Agua() )) );
		assertFalse( this.mixta1.equals(agua) );
		assertFalse( this.mixta1.equals(tierra) );
		assertFalse( this.mixta1.equals(mixta2) );
		assertTrue( this.mixta2.equals( new Mixta( new Agua() , new Tierra() , new Tierra() , mixtaAux )) );
		assertFalse( this.mixta2.equals(agua) );
		assertFalse( this.mixta2.equals(tierra) );
		assertFalse( this.mixta2.equals(mixta1) );
	}
	

}
