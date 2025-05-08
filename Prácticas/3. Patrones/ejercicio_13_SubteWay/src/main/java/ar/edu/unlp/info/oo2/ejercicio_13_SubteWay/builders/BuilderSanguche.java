package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.builders;

import ar.edu.unlp.info.oo2.ejercicio_13_SubteWay.Sanguche;

public interface BuilderSanguche {

	public void nuevoSanguche();
	public void agregarPan();
	public void agregarAderezo();
	public void agregarPrincipal();
	public void agregarAdicional();
	public Sanguche build();
	
}
