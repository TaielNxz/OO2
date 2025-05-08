package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.estado;

import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.Excursion;
import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.Usuario;

public class Completa extends Estado {

	public Completa(Excursion excursion) {
		super(excursion);
	}

	public void inscribir(Usuario usuario) {
		excursion.getEnEspera().add(usuario);	
	}
	
}
