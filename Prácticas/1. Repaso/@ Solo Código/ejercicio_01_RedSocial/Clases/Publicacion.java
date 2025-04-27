package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial;

public abstract class Publicacion {

	private Usuario autor;

	public Publicacion( Usuario autor ) {
		this.autor = autor;
	}

	
	public Usuario getAutor() {
		return this.autor;
	}
	
	
	public abstract String getContenido();
	public abstract void eliminar();

}