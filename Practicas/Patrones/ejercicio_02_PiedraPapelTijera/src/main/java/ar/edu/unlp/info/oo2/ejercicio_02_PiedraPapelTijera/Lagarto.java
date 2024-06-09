package ar.edu.unlp.info.oo2.ejercicio_02_PiedraPapelTijera;

public class Lagarto extends Jugada {

	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraLagarto();
	}

	public String jugarContraPiedra() {
		return "Pierde Lagarto";
	}

	public String jugarContraPapel() {
		return "Gana Lagarto";
	}

	public String jugarContraTijera() {
		return "Pierde Lagarto";
	}
	
	public String jugarContraLagarto() {
		return "Empate";
	}

	public String jugarContraSpock() {
		return "Gana Lagarto";
	}
	
}
