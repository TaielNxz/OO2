package ar.edu.unlp.info.oo2.ejercicio_02_PiedraPapelTijera;

public class Tijera extends Jugada {

	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraTijera();
	}

	public String jugarContraPiedra() {
		return "Pierde Tijera";
	}

	public String jugarContraPapel() {
		return "Gana Tijera";
	}

	public String jugarContraTijera() {
		return "Empate";
	}
	
	public String jugarContraLagarto() {
		return "Gana Tijera";
	}

	public String jugarContraSpock() {
		return "Pierde Tijera";
	}
	
}
