package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial;

public class Tweet extends Publicacion {

	private String texto;
	
	public Tweet( Usuario autor , String texto ) {
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
