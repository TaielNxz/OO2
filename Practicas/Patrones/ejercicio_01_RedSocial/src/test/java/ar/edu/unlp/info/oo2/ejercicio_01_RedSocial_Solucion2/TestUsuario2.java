package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion1.Usuario;

class TestUsuario2 {

	Usuario2 usuario;
	
	@BeforeEach
	void setUp() throws Exception {
		usuario = new Usuario2( "usuario1" );
	}

	@Test
	void testPublicarTweet() {
		assertNotNull( usuario.publicarTweet("nuevo tweet 1") );
	}
	
	@Test
	void testPublicarTweetLargo() {
		assertNull( usuario.publicarTweet("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut nec odio nec odio consequat gravida. Vestibulum in lorem ipsum. Nulla vitae mi id dui blandit ultrices. Sed sed neque eu elit suscipit fringilla vel nec nisi. Sed eget ullamcorper metus, vel ullamcorper justo. In hac habitasse platea.") );
	}

	@Test
	void testPublicarRetweet() {
		Tweet2 tweet = usuario.publicarTweet("nuevo tweet");
		assertNotNull( usuario.publicarRetweet( tweet ) );
	}
	
	@Test
	void testRetweetDeTweetInexistente() {
		assertNull( usuario.publicarRetweet( null ) );
	}
	
	@Test
	void testEliminarTweet() {
		Tweet2 tweet = usuario.publicarTweet("nuevo tweet");
		assertTrue( usuario.eliminarTweet( tweet ) );
	}
	
	@Test
	void testEliminarTweetNoExistente() {
		Tweet2 tweet = usuario.publicarTweet("nuevo tweet");
		usuario.eliminarTweets();
		assertFalse( usuario.eliminarTweet( tweet ) );
	}
	
	@Test
	void testEliminarTweets() {
		usuario.publicarTweet("nuevo tweet");
		usuario.publicarTweet("nuevo tweet");
		usuario.publicarTweet("nuevo tweet");
		assertTrue( usuario.eliminarTweets() );
	}
}
