package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

public class Ingrediente {

	private String nombre;
	private int precio;
	
	public Ingrediente(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
