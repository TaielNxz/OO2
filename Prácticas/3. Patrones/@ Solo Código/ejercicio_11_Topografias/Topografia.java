package ar.edu.unlp.info.oo2.ejercicio_11_Topografias;

import java.util.List;

public abstract class Topografia {


	public abstract double getProporcionAgua();
	
	
	public double getProporcionTierra() {
		return ( 1 - this.getProporcionAgua() );
	}
	

	public Object getTopografia() {
		return this;
	}

	
	public boolean compararTopografia( Topografia topografia ) {
		return ( this.getProporcionAgua() == topografia.getProporcionAgua() );
	}
	
	
	public boolean equals(Object objeto) {
		return this.compararTopografia( (Topografia) objeto ); 
	}

}
