package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.estado;

import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.Excursion;
import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.Usuario;

public class Definitiva extends Estado {

	public Definitiva(Excursion excursion) {
		super(excursion);
	}

	public void inscribir(Usuario usuario) {
		excursion.getInscriptos().add(usuario);

		if (excursion.alcanzoCupoMaximo()) {
			excursion.setEstado(new Completa(excursion));
		}
	}

	@Override
	public String obtenerInformacion() {
		return super.obtenerInformacion()
			 + "Faltantes para el cupo maximo: " + excursion.faltantesParaCupoMaximo() + "\n"
			 + "Mails de los usuarios inscriptos:\n" + excursion.mailsDeInscriptos();
	}
}

