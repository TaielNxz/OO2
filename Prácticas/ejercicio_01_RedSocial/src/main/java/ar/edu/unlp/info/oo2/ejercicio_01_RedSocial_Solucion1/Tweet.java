package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion1;

public class Tweet {

	private Usuario autor;
	private String texto;

	public Tweet( Usuario autor , String texto ) {
		this.autor = autor;
		this.texto = texto;
	}

	
	public Usuario getAutor() {
		return this.autor;
	}
	
	
	public String getContenido() {
		return "Autor del Tweet: " + this.getAutor().getScreenName() + "\n" +
			   "      Contenido: " + this.texto;
	}
	
	
	public void eliminar() {
		this.texto = "publicacion eliminada";
	}
	
}
