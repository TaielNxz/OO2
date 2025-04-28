package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

import java.util.List;
import java.util.ArrayList;

public class Sanguche {

	private List<Ingrediente> ingredientes;

	public Sanguche() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}

	public List<Ingrediente> getPartes() {
		return ingredientes;
	}
	
	public double getPrecio() {
		return this.getPartes().stream()
				.mapToDouble(parte -> parte.getPrecio())
				.sum();
	}
	
	public void agregarIngrediente( Ingrediente ingrediente ) {
		this.ingredientes.add( ingrediente );
	}
	
}
