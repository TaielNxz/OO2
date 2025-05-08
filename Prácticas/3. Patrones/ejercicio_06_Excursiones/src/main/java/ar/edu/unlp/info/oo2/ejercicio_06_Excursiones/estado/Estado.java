package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.estado;

import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.Excursion;
import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.Usuario;

public abstract class Estado {

	protected Excursion excursion;
	
	public Estado(Excursion excursion) {
		this.excursion = excursion;
	}
	
	public abstract void inscribir( Usuario usuario );
	
	public String obtenerInformacion() {
		return excursion.obtenerInformacionBasica();
	}
	
}
