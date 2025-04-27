package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

public class DatoPromedioFahrenheit extends Dato {

	public DatoPromedioFahrenheit(Temperatura componente) {
		super(componente);
	}
	
	
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas: " + Math.round(this.getPromedioFahrenheit()) + "°F\n";
	}
	
	
	public double getPromedioFahrenheit() {
		return ( this.getTemperaturas().stream().mapToDouble(temp -> temp).sum() ) / this.getTemperaturas().size();	
	}

}
