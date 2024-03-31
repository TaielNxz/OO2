package ar.edu.unlp.info.oo2.ejercicio_02_PiedraPapelTijera;

public abstract class Jugada {

	public abstract String jugarContra(Jugada jugada);
	
	public abstract String jugarContraPiedra();
	
	public abstract String jugarContraPapel();
	
	public abstract String jugarContraTijera();
	
	public abstract String jugarContraLagarto();
	
	public abstract String jugarContraSpock();
	
}
