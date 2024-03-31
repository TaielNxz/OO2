package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion2;

public abstract class Tweet2 {

	private Usuario2 autor;

	
	public Tweet2( Usuario2 autor ) {
		this.autor = autor;
	}
	

	public Usuario2 getAutor() {
		return this.autor;
	}
	
	public abstract void eliminar();
	
	public abstract String getContenido();


}
