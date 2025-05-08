package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Ingrediente;
import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Sanguche;

public class BuilderSangucheClasico implements BuilderSanguche {

	private Sanguche sanguche;
	
	@Override
	public void nuevoSanguche() {
		this.sanguche = new Sanguche();
	}
	
	@Override
	public void agregarPan() {
		this.sanguche.agregarIngrediente(new Ingrediente("brioche", 100));
	}

	@Override
	public void agregarAderezo() {
		this.sanguche.agregarIngrediente(new Ingrediente("mayonesa", 20));
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.agregarIngrediente(new Ingrediente("carne de ternera ", 300));
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.agregarIngrediente(new Ingrediente("tomate", 80));
	}

	@Override
	public Sanguche build() {
		return this.sanguche;
	}

}





