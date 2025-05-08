package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.estado;

import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.Excursion;
import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.Usuario;

public class Provisoria extends Estado  {

	public Provisoria(Excursion excursion) {
		super(excursion);
	}

	public void inscribir(Usuario usuario) {
		excursion.getInscriptos().add(usuario);
		
		if ( excursion.alcanzoCupoMinimo() ) {
			excursion.setEstado( new Definitiva(excursion) );
		}
		
	}
	
	public String obtenerInformacion() {
		return super.obtenerInformacion() + "Faltantes para el cupo minimo: " + excursion.faltantesParaCupoMinimo();
		
	};

}
