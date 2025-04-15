package ar.edu.unlp.info.oo2.ejercicio_03_MediaPlayer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaPlayerTest {

	MediaPlayer reproductor;
	
	@BeforeEach
	void setUp() throws Exception {
		reproductor = new MediaPlayer();
	}
	
	@Test
	void testAddMedia() {
		Audio audio0 = new Audio();
		Audio audio1 = new Audio();
		Audio audio2 = new Audio();
		Audio audio3 = new Audio();
		
		reproductor.addMedia( audio0 );
		reproductor.addMedia( audio1 );
		reproductor.addMedia( audio2 );
		reproductor.addMedia( audio3 );
		
		assertEquals( 4 , reproductor.getMediaList().size() );
	}
	

	@Test
	void testReproducirAudio() {
		Audio audio = new Audio();
		reproductor.addMedia( audio );
		assertEquals( "reproduciendo Audio..." , reproductor.play(0) );
	}
	
	@Test
	void testReproducirVideoFile() {
		VideoFile videoFile = new VideoFile();
		reproductor.addMedia( videoFile );
		assertEquals( "reproduciendo VideoFile..." , reproductor.play(0) );
	}
	
	@Test
	void testReproducirVideoStream() {
		VideoStream videoStream = new VideoStream();
		AdapterVideoStream adapterVideoStream = new AdapterVideoStream(videoStream);
		reproductor.addMedia( adapterVideoStream );
		assertEquals( "reproduciendo VideoStream..." , reproductor.play(0) );
	}

}
