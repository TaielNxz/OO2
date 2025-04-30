package ar.edu.unlp.info.oo2.ejercicio_19_EstacionMeteorologica;

public class DatoPresion extends Dato {

	public DatoPresion(Temperatura componente) {
		super(componente);
	}

	
	public String displayData() {
		return super.displayData() + " Presion atmosferica: " + Math.round(this.getPresion()) + "\n";
	}
	
}
