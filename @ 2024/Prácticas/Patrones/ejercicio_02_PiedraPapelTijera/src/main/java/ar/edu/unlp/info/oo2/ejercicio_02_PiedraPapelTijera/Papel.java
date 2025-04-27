package ar.edu.unlp.info.oo2.ejercicio_02_PiedraPapelTijera;

public class Papel extends Jugada {

	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraPapel();
	}

	public String jugarContraPiedra() {
		return "Gana Papel";
	}

	public String jugarContraPapel() {
		return "Empate";
	}

	public String jugarContraTijera() {
		return "Pierde Papel";
	}
	
	public String jugarContraLagarto() {
		return "Pierde Papel";
	}

	public String jugarContraSpock() {
		return "Gana Papel";
	}

}
