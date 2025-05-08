package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Sanguche;

public abstract class BuilderSanguche {

	public abstract void nuevoSanguche();
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
	public abstract Sanguche build();
	
}
