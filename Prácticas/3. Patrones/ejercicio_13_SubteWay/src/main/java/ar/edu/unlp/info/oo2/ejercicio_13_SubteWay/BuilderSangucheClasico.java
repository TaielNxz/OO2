package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

public class BuilderSangucheClasico extends BuilderSanguche {

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

}
