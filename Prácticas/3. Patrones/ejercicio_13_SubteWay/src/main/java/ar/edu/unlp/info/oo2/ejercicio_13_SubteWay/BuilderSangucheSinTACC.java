package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

public class BuilderSangucheSinTACC extends BuilderSanguche {

	@Override
	public void agregarPan() {
		this.sanguche.agregarIngrediente(new Ingrediente("Pan de chipá", 150));
	}

	@Override
	public void agregarAderezo() {
		this.sanguche.agregarIngrediente(new Ingrediente("Salsa tártara", 18));
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.agregarIngrediente(new Ingrediente("Carne de pollo", 250));
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.agregarIngrediente(new Ingrediente("Verduras grilladas", 200));
	}

}
