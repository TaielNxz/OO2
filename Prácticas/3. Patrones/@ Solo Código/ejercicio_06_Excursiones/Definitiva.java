package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones;

import java.util.List;

public class Definitiva extends Estado {

	public Definitiva(Excursion excursion) {
		super(excursion);
	}
	
	
	public void inscribir(Usuario usuario) {
		
		Excursion excursion = this.getExcursion();
		
		excursion.getInscriptos().add(usuario);
		
		if ( excursion.alcanzoCupoMinimo() ) {
			excursion.setEstado( new Completa(excursion) );
		}
		
	}


	public String obtenerInformacion() {
		
		Excursion excursion = this.getExcursion();
		
		return   "Faltantes para el cupo minimo: " + excursion.faltantesParaCupoMinimo()
			   + "\nMails de los usuarios inscriptos: " + excursion.mailsDeInscriptos();
			   
	}


}
