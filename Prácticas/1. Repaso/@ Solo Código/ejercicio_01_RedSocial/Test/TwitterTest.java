package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwitterTest {

	Twitter twitter;

	@BeforeEach
	void setUp() throws Exception {
		twitter = new Twitter();
	}
	
	@Test
	void testTweets() {
		
		Usuario usuario1 = new Usuario("Usuario 1");
		Usuario usuario2 = new Usuario("Usuario 2");
		Usuario usuario3 = new Usuario("Usuario 3");
		
		//
		// Tweet1 (U1) <<--- Retweet1 (U2) <<--- Retweet2 (U3)
		//    ^                                     ^
		//    |                                     | 
		// Retweet3 (U3)                         Retweet4 (U1)
		//
		Publicacion tweet1 = usuario1.publicarTweet( "texto del tweet 1 ");
		Publicacion retweet1 = usuario2.publicarRetweet( tweet1 );
		Publicacion retweet2 = usuario3.publicarRetweet( retweet1 );
		Publicacion retweet3 = usuario3.publicarRetweet( tweet1 );                    
		Publicacion retweet4 = usuario1.publicarRetweet( retweet2 );
		
		assertEquals( 2 , usuario1.getTweets().size() );
		assertEquals( 1 , usuario2.getTweets().size() );
		assertEquals( 2 , usuario3.getTweets().size() );
		
		System.out.print( retweet2.getContenido() + "\n\n" ); // desde el Retweet2
		System.out.print( retweet4.getContenido() + "\n\n" ); // desde el Retweet4
		
		usuario2.eliminarTweet( retweet1 );
		
		System.out.print( retweet2.getContenido() + "\n\n" ); // desde el Retweet2
		System.out.print( retweet4.getContenido() + "\n\n" ); // desde el Retweet4
		
	}

	
	@Test
	void testRegistrarUsuario() {	
		 assertNotNull( twitter.registrarUsuario( "usuario1" ) );
		 assertNotNull( twitter.registrarUsuario( "usuario2" ) );
		 assertNotNull( twitter.registrarUsuario( "usuario3" ) );
		 assertEquals( 3 , twitter.getUsuarios().size() );
	}
	
	@Test
	void testRegistrarUsuarioYaExistente() {
		twitter.registrarUsuario( "usuario1" );
		assertNull( twitter.registrarUsuario( "usuario1" ) );
	}
	
	
	@Test
	void testEliminarUsuario() {
		twitter.registrarUsuario( "usuario2" );
		assertTrue( twitter.eliminarUsuario( "usuario2" ) );	
	}
	
	@Test
	void testEliminarUsuarioNoExistente() {
		assertFalse( twitter.eliminarUsuario( "usuario3" ) );	
	}
	
	@Test
	void testObtenerUsuario() {
		twitter.registrarUsuario( "usuario4" );
		assertNotNull( twitter.getUsuario( "usuario4" ) );
	}; 
	
	@Test
	void testObtenerUsuarioNoExistente() {
		assertNull( twitter.getUsuario( "usuario5" ) );	
	}

}

