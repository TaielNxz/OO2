package ar.edu.unlp.info.oo2.ejercicio_22_SubteWay;

public class BuilderSangucheVegano extends BuilderSanguche {

	@Override
	public void agregarPan() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("pan Integral", 100));
	}

	@Override
	public void agregarAderezo() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("salsa criolla", 20));
	}

	@Override
	public void agregarPrincipal() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("milanesa de girgolas", 500));
	}

	@Override
	public void agregarAdicional() {
		// TODO Auto-generated method stub
		
	}

}
