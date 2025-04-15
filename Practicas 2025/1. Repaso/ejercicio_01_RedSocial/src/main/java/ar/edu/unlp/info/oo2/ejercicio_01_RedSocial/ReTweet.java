package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial;

public class ReTweet extends Publicacion {

	private Publicacion tweetOrigen;
	
	public ReTweet( Usuario autor , Publicacion tweetOrigen ) {
		super(autor);
		this.tweetOrigen = tweetOrigen;
	}
	

	public String getContenido() {
		return ( this.tweetOrigen != null ) ? this.tweetOrigen.getContenido()
		                                    : "publicacion eliminada";
	}
	
	
	public void eliminar() {
		this.tweetOrigen = null;
	}

}