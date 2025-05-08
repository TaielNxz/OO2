package ar.edu.unlp.info.oo2.ejercicio_11b_MasTopografias;

public abstract class Topografia {

	public abstract double getProporcionAgua();
	
	public double getProporcionTierra() {
		return 1 - this.getProporcionAgua();
	}

	public abstract boolean compararTopografia(Topografia topografia);
	
	@Override
	public boolean equals(Object objeto) {
		if (this == objeto) return true;	
		if (objeto == null || getClass() != objeto.getClass()) return false;
		return this.compararTopografia((Topografia) objeto);
	}

}
