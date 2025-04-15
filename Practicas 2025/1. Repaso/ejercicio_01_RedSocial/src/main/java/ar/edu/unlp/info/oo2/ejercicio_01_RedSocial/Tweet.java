package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial;

public class Tweet extends Publicacion {

	private String contenido;
	
	public Tweet( Usuario autor , String texto ) {
		super(autor);
		this.contenido = texto;
	}

	
	public String getContenido() {
		return "Autor del Tweet: " + this.getAutor().getScreenName() + "\n" +
			   "      Contenido: " + this.contenido;
	}


	public void eliminar() {
		this.contenido = "publicacion eliminada";
	}
	
}
