package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

public class DatoPromedioFahrenheit extends Dato {

	public DatoPromedioFahrenheit(Temperatura componente) {
		super(componente);
	}
	
	
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas F: " + Math.round(this.getPromedioFahrenheit()) + "\n";
	}
	
	
	public double getPromedioFahrenheit() {
		return ( this.getTemperaturas().stream().mapToDouble(temp -> temp).sum() ) / this.getTemperaturas().size();	
	}

}
