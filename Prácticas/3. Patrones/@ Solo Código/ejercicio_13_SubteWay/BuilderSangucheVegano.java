package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

public class BuilderSangucheVegano extends BuilderSanguche {

	@Override
	public void agregarPan() {
		this.sanguche.agregarIngrediente(new Ingrediente("pan Integral", 100));
	}

	@Override
	public void agregarAderezo() {
		this.sanguche.agregarIngrediente(new Ingrediente("salsa criolla", 20));
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.agregarIngrediente(new Ingrediente("milanesa de girgolas", 500));
	}

	@Override
	public void agregarAdicional() {
		
	}

}
