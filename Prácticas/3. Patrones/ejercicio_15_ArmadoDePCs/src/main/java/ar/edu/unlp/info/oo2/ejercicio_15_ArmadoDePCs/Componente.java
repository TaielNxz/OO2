package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs;

public class Componente {

	private String nombre;
	private double descripcion;
	private double precio;
	private double consumo;
	
	public Componente(String nombre, double descripcion, double precio, double consumo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.consumo = consumo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getDescripcion() {
		return descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public double getConsumo() {
		return consumo;
	}
	
}
