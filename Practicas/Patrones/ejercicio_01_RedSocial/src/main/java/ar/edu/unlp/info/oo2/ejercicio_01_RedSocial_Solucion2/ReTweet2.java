package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion2;

public class ReTweet2 extends Tweet2  {
	
	private Tweet2 tweetOrigen;

	
	public ReTweet2( Usuario2 autor , Tweet2 tweetOrigen ) {
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
