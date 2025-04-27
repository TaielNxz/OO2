package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones;

public class Completa extends Estado {

	public Completa(Excursion excursion) {
		super(excursion);
	}


	public void inscribir(Usuario usuario) {
		this.getExcursion().getEnEspera().add(usuario);	
	}


	public String obtenerInformacion() {
		return "";
	}

}
