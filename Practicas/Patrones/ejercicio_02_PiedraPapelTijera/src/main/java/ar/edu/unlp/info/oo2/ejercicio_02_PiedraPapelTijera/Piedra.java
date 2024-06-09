package ar.edu.unlp.info.oo2.ejercicio_02_PiedraPapelTijera;

public class Piedra extends Jugada {

	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraPiedra();
	}

	public String jugarContraPiedra() {
		return "Empate";
	}

	public String jugarContraPapel() {
		return "Pierde Piedra";
	}

	public String jugarContraTijera() {
		return "Gana Piedra";
	}
	
	public String jugarContraLagarto() {
		return "Gana Piedra";
	}

	public String jugarContraSpock() {
		return "Pierde Piedra";
	}
	
}
