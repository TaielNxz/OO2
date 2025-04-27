package ar.edu.unlp.info.oo2.ejercicio_22_SubteWay;

public class BuilderSangucheVegetariano extends BuilderSanguche {

	@Override
	public void agregarPan() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("pan con semillas", 120));
	}

	@Override
	public void agregarAderezo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void agregarPrincipal() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("provoleta grillada", 200));
	}

	@Override
	public void agregarAdicional() {
		// TODO Auto-generated method stub
		this.sanguche.agregarIngrediente(new Ingrediente("berenjenas al escabeche", 100));
	}

}
