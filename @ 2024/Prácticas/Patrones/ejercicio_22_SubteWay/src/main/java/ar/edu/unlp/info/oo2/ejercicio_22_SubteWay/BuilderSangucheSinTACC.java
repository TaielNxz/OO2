package ar.edu.unlp.info.oo2.ejercicio_22_SubteWay;

public class BuilderSangucheSinTACC extends BuilderSanguche {

	@Override
	public void agregarPan() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("Pan de chipá", 150));
	}

	@Override
	public void agregarAderezo() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("Salsa tártara", 18));
	}

	@Override
	public void agregarPrincipal() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("Carne de pollo", 250));
	}

	@Override
	public void agregarAdicional() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("Verduras grilladas", 200));
	}

}
