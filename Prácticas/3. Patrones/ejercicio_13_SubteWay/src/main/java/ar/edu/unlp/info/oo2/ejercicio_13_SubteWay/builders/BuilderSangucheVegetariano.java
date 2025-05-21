package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Sanguche;

public class BuilderSangucheVegetariano implements BuilderSanguche {

	private Sanguche sanguche;
	
	@Override
	public void nuevoSanguche() {
		this.sanguche = new Sanguche();
	}
	
	@Override
	public void agregarPan() {
		this.sanguche.setPan("pan con semillas");
		this.sanguche.setPrecioPan(120);
	}

	@Override
	public void agregarAderezo() {
		this.sanguche.setAderezo(null);  // sin aderezo
		this.sanguche.setPrecioAderezo(0);
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.setPrincipal("provoleta grillada");
		this.sanguche.setPrecioPrincipal(200);
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.setAdicional("berenjenas al escabeche");
		this.sanguche.setPrecioAdicional(100);
	}

	@Override
	public Sanguche build() {
		return this.sanguche;
	}
}
