package ar.edu.unlp.info.oo2.ejercicio_11_Topografias;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topografia {

	private List<Topografia> componentes;

	public Mixta( Topografia componente1, Topografia componente2, Topografia componente3, Topografia componente4 ) {
		this.componentes = new ArrayList<Topografia>();
		this.componentes.add(componente1);
		this.componentes.add(componente2);
		this.componentes.add(componente3);
		this.componentes.add(componente4);
	}

	@Override
	public double getProporcionAgua() {
		return this.componentes.stream()
			.mapToDouble(Topografia::getProporcionAgua)
			.sum() / 4;
	}

	@Override
	public boolean compararTopografia(Topografia topografia) {
		if (!(topografia instanceof Mixta)) return false;
		Mixta otra = (Mixta) topografia;
		return this.componentes.equals(otra.componentes);
	}

}
