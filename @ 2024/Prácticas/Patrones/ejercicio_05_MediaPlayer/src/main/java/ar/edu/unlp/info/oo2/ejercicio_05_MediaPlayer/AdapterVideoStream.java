package ar.edu.unlp.info.oo2.ejercicio_05_MediaPlayer;

public class AdapterVideoStream extends Media {

	VideoStream videoStream;
	
	public String play() {
		return videoStream.Reproduce();
	}

}
