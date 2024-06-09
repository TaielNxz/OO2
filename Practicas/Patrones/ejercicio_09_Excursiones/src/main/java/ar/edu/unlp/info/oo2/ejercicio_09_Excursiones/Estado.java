package ar.edu.unlp.info.oo2.ejercicio_09_Excursiones;

public abstract class Estado {

	private Excursion excursion;
	
	
	public Estado( Excursion excursion ) {
		this.excursion = excursion;
	}
	
	
	public Excursion getExcursion() {
		return excursion;
	}
	
	
	public abstract void inscribir( Usuario usuario );
	
	
	public abstract String obtenerInformacion();
	
	
	
}
