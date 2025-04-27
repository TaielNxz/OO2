package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

public class DatoMinCelsius extends Dato {

	public DatoMinCelsius(Temperatura componente) {
		super(componente);
	}
	
	public String displayData() {
		
		double min = Math.round( this.getTemperaturas().stream()
				.mapToDouble( temp -> (temp-32)/1.8 )
				.min()
				.orElse(0));	
		
		return super.displayData() + " Minimo: " + min + "°C\n";
		
	}

}
