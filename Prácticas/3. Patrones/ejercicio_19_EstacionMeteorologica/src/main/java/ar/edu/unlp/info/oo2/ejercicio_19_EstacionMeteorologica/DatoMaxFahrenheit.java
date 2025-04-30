package ar.edu.unlp.info.oo2.ejercicio_19_EstacionMeteorologica;

public class DatoMaxFahrenheit extends Dato {

	public DatoMaxFahrenheit(Temperatura componente) {
		super(componente);
	}

	public String displayData() {
		
		double max = Math.round( this.getTemperaturas().stream()
				.mapToDouble( temp -> temp )
				.max()
				.orElse(0));

		return super.displayData() + " Maximo: " + max + "°F\n";
		
	}
	
}
