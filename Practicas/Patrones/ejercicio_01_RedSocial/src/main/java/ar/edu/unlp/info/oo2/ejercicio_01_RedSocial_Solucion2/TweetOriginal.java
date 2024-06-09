package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion2;

public class TweetOriginal extends Tweet2 {

	private String texto;
	
	public TweetOriginal( Usuario2 autor , String texto ) {
		super(autor);
		this.texto = texto;
	}

	
	public String getContenido() {
		return "Autor del Tweet: " + this.getAutor().getScreenName() + "\n" +
			   "      Contenido: " + this.texto;
	}


	public void eliminar() {
		this.texto = "publicacion eliminada";
	}

}
