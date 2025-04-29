package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

public abstract class BuilderSanguche {

	protected Sanguche sanguche;
	
	public void nuevoSanguche() {
		this.sanguche = new Sanguche();
	}
	
	public Sanguche build() {
		return this.sanguche;
	}
	
	public abstract void agregarPan();
	public abstract void agregarAderezo();
	public abstract void agregarPrincipal();
	public abstract void agregarAdicional();
	
}
