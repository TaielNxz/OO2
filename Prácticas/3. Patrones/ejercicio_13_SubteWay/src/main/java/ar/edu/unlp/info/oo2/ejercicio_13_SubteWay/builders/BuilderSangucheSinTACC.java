package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Sanguche;

public class BuilderSangucheSinTACC implements BuilderSanguche {

	private Sanguche sanguche;
	
	@Override
	public void nuevoSanguche() {
		this.sanguche = new Sanguche();
	}
	
	@Override
	public void agregarPan() {
		this.sanguche.setPan("Pan de chipá");
		this.sanguche.setPrecioPan(150);
	}

	@Override
	public void agregarAderezo() {
		this.sanguche.setAderezo("Salsa tártara");
		this.sanguche.setPrecioAderezo(18);
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.setPrincipal("Carne de pollo");
		this.sanguche.setPrecioPrincipal(250);
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.setAdicional("Verduras grilladas");
		this.sanguche.setPrecioAdicional(200);
	}

	@Override
	public Sanguche build() {
		return this.sanguche;
	}
}
