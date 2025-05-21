package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Sanguche;

public class BuilderSangucheClasico implements BuilderSanguche {

	private Sanguche sanguche;
	
	@Override
	public void nuevoSanguche() {
		this.sanguche = new Sanguche();
	}
	
	@Override
	public void agregarPan() {
		this.sanguche.setPan("brioche");
		this.sanguche.setPrecioPan(100);
	}

	@Override
	public void agregarAderezo() {
		this.sanguche.setAderezo("mayonesa");
		this.sanguche.setPrecioAderezo(20);
	}

	@Override
	public void agregarPrincipal() {
		this.sanguche.setPrincipal("carne de ternera");
		this.sanguche.setPrecioPrincipal(300);
	}

	@Override
	public void agregarAdicional() {
		this.sanguche.setAdicional("tomate");
		this.sanguche.setPrecioAdicional(80);
	}

	@Override
	public Sanguche build() {
		return this.sanguche;
	}
}
