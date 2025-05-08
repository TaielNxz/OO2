package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Ingrediente;
import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Sanguche;

public class BuilderSangucheVegetariano implements BuilderSanguche {

	private Sanguche sanguche;
	
	@Override
	public void nuevoSanguche() {
		this.sanguche = new Sanguche();
	}
	
	@Override
	public void agregarPan() {
		this.sanguche.agregarIngrediente(new Ingrediente("pan con semillas", 120));
	}

	@Override
	public void agregarAderezo() {

	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.agregarIngrediente(new Ingrediente("provoleta grillada", 200));
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.agregarIngrediente(new Ingrediente("berenjenas al escabeche", 100));
	}

	@Override
	public Sanguche build() {
		return this.sanguche;
	}

}
