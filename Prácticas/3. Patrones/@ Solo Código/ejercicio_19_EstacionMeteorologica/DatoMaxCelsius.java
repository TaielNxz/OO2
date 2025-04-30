package ar.edu.unlp.info.oo2.ejercicio_19_EstacionMeteorologica;

public class DatoMaxCelsius extends Dato {

	public DatoMaxCelsius(Temperatura componente) {
		super(componente);
	}
	
	public String displayData() {
		
		double max = Math.round( this.getTemperaturas().stream()
				.mapToDouble( temp -> (temp-32)/1.8 )
				.max()
				.orElse(0));

		return super.displayData() + " Maximo: " + max + "°C\n";
		
	}

}
