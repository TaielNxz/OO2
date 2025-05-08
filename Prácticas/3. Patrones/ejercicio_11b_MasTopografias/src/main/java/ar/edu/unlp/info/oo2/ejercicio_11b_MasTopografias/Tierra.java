package ar.edu.unlp.info.oo2.ejercicio_11b_MasTopografias;

public class Tierra extends Topografia {

	@Override
	public double getProporcionAgua() {
		return 0;
	}

	@Override
	public boolean compararTopografia(Topografia topografia) {
		return topografia instanceof Tierra;
	}
	
}