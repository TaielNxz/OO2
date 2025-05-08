package ar.edu.unlp.info.oo2.ejercicio_11_Topografias;

public class Agua extends Topografia {

	@Override
	public double getProporcionAgua() {
		return 1;
	}

	@Override
	public boolean compararTopografia(Topografia topografia) {
		return topografia instanceof Agua;
	}
	
}