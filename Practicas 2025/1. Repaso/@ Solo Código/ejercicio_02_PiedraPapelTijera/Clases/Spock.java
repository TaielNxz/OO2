package ar.edu.unlp.info.oo2.ejercicio_02_PiedraPapelTijera;

public class Spock extends Jugada {

	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraSpock();
	}

	public String jugarContraPiedra() {
		return "Gana Spock";
	}

	public String jugarContraPapel() {
		return "Pierde Spock";
	}

	public String jugarContraTijera() {
		return "Gana Spock";
	}
	
	public String jugarContraLagarto() {
		return "Pierde Spock";
	}

	public String jugarContraSpock() {
		return "Empate";
	}
	
}
