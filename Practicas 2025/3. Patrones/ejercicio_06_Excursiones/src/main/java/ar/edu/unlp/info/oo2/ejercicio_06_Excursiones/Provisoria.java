package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones;

public class Provisoria extends Estado  {

	public Provisoria(Excursion excursion) {
		super(excursion);
	}


	public void inscribir(Usuario usuario) {
		
		Excursion excursion = this.getExcursion();
		
		excursion.getInscriptos().add(usuario);
		
		if ( excursion.alcanzoCupoMinimo() ) {
			excursion.setEstado( new Definitiva(excursion) );
		}
		
	}
	
	
	public String obtenerInformacion() {
		return "Faltantes para el cupo minimo: " + this.getExcursion().faltantesParaCupoMinimo();
	};


}
