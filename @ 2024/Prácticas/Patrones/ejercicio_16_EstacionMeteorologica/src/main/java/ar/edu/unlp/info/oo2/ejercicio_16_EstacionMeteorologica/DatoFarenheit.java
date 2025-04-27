package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

public class DatoFarenheit extends Dato {

	public DatoFarenheit(Temperatura componente) {
		super(componente);
	}


	public String displayData() {
		return super.displayData() + " Temperatura Farenheit: " + Math.round(this.getTemperatura()) + "\n";
	}
	
}
