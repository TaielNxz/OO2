package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion1;

public class ReTweet extends Tweet  {
	
	private Tweet tweetOrigen;

	public ReTweet( Usuario autor , Tweet tweetOrigen ) {
		super( autor , tweetOrigen.getContenido() );
		this.tweetOrigen = tweetOrigen;
	}

	
	public String getContenido() {
		
		return this.tweetOrigen != null ? this.tweetOrigen.getContenido()
				                        : "publicacion eliminada";
	}
	
	
	public void eliminar() {
		this.tweetOrigen = null;
	}

}
