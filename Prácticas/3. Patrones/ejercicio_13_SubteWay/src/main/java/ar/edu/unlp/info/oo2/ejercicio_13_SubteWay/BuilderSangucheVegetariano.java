package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

public class BuilderSangucheVegetariano extends BuilderSanguche {

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

}
