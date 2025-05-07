package ar.edu.unlp.info.oo2.ejercicio_03_MediaPlayer;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio_03_MediaPlayer.media.Media;

public class MediaPlayer {

	private List<Media> mediaList; 
	
	public MediaPlayer() {
		this.mediaList = new ArrayList<Media>();
	}
	
	public List<Media> getMediaList() {
		return mediaList;
	}
	
	public String play(int index) {
		
		if (index >= 0 && index < mediaList.size()) {
			return mediaList.get(index).play();
		}
		
		/*
		 * Me hacia ruido no tener una validación de esto...
		 * La excepción IndexOutOfBoundsException se lanza para indicar que un índice de algún tipo 
		 * (como el índice de un array, una cadena, una lista o un vector) está fuera de rango.
		 */
		throw new IndexOutOfBoundsException("Índice inválido");
		
	}
	
	public void addMedia( Media media ) {
		this.mediaList.add(media);
	}
	
}
