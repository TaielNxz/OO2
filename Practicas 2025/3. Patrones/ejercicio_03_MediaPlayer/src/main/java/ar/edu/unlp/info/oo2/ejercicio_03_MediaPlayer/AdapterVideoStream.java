package ar.edu.unlp.info.oo2.ejercicio_03_MediaPlayer;

public class AdapterVideoStream extends Media {

	private VideoStream adaptee;
	
    public AdapterVideoStream( VideoStream adaptee ) {
		this.adaptee = adaptee;
	}
	
	public String play() {
		return adaptee.reproduce();
	}

}
