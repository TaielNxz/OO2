package ar.edu.unlp.info.oo2.ejercicio_11b_MasTopografias;

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
	

	public double getProporcionAgua() {
		return this.componentes.stream().mapToDouble(componente -> componente.getProporcionAgua()).sum() / this.componentes.size();
	}
	
	
	public boolean isEquals(Topografia topografia) {
		return this.getTopografia().equals(topografia.getTopografia());
	}
	

	public List<Topografia> getTopografia() {
		return this.componentes;
	}
	

}
