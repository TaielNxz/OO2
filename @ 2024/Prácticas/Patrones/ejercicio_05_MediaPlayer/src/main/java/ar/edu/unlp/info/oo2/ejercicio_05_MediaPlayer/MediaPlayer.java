package ar.edu.unlp.info.oo2.ejercicio_05_MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

	private List<Media> mediaList; 

	
	public MediaPlayer() {
		this.mediaList = new ArrayList<Media>();
	}
	
	
	public void play( int index ) {
		System.out.println( mediaList.get(index) );
	}
	
	
	public void addMedia( Media media ) {
		this.mediaList.add(media);
	}
	
}
