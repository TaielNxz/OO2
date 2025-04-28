package ar.edu.unlp.info.oo2.ejercicio_11b_MasTopografias;

import java.util.List;

public abstract class Topografia {


	public abstract double getProporcionAgua();
	
	
	public double getProporcionTierra() {
		return ( 1 - this.getProporcionAgua() );
	}
	
	
	public boolean isEquals( Topografia topografia ) {
		return ( this.getProporcionAgua() == topografia.getProporcionAgua() );
	}

	
	public Object getTopografia() {
		return this;
	}


}
