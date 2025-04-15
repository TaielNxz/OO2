package ar.edu.unlp.info.oo2.ejercicio_03_MediaPlayer;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

	private List<Media> mediaList; 

	
	public MediaPlayer() {
		this.mediaList = new ArrayList<Media>();
	}
	
	public List<Media> getMediaList() {
		return mediaList;
	}
	
	
	public String play( int index ) {
		return mediaList.get(index).play();
	}
	
	
	public void addMedia( Media media ) {
		this.mediaList.add(media);
	}
	
}
