package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

public class DatoRadiacion extends Dato {

	public DatoRadiacion(Temperatura componente) {
		super(componente);
	}
	
	
	public String displayData() {
		return super.displayData() + " Radiacion solar: " + Math.round(this.getRadiacionSolar()) + "\n";
	}

}
