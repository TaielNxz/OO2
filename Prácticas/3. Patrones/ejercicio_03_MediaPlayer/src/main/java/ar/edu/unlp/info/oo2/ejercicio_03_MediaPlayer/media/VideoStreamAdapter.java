package ar.edu.unlp.info.oo2.ejercicio_03_MediaPlayer.media;

public class VideoStreamAdapter extends Media {

	private VideoStream adaptee;
	
    public VideoStreamAdapter( VideoStream adaptee ) {
		this.adaptee = adaptee;
	}
	
	public String play() {
		return adaptee.reproduce();
	}

}
