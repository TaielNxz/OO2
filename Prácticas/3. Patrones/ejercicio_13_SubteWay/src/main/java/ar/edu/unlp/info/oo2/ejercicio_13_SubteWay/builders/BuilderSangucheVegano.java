package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Sanguche;

public class BuilderSangucheVegano implements BuilderSanguche {

	private Sanguche sanguche;
	
	@Override
	public void nuevoSanguche() {
		this.sanguche = new Sanguche();
	}
	
	@Override
	public void agregarPan() {
		this.sanguche.setPan("pan integral");
		this.sanguche.setPrecioPan(100);
	}

	@Override
	public void agregarAderezo() {
		this.sanguche.setAderezo("salsa criolla");
		this.sanguche.setPrecioAderezo(20);
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.setPrincipal("milanesa de girgolas");
		this.sanguche.setPrecioPrincipal(500);
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.setAdicional(null);  // o dejar vacío si no hay adicional
		this.sanguche.setPrecioAdicional(0);
	}

	@Override
	public Sanguche build() {
		return this.sanguche;
	}
}
