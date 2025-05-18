package ar.edu.unlp.info.oo2.ejercicio_19_EstacionMeteorologica;

public class DatoMinFahrenheit extends Dato {

	public DatoMinFahrenheit(Temperatura componente) {
		super(componente);
	}
	
	public String displayData() {
		
		double min = Math.round( this.getTemperaturas().stream()
				.mapToDouble( temp -> temp )
				.min()
				.orElse(0));	

		return super.displayData() + " Minimo: " + min + "°F\n";
		
	}

}
