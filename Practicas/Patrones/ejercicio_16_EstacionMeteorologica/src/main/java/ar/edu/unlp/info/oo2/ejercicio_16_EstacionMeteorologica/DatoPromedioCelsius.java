package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

public class DatoPromedioCelsius extends Dato {

	public DatoPromedioCelsius(Temperatura componente) {
		super(componente);
	}

	
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas: " + Math.round(this.getPromedioCelsius()) + "°C\n";
	}
	
	
	public double getPromedioCelsius() {
		return this.convertirCelsius( ( this.getTemperaturas().stream().mapToDouble(temp -> temp).sum()) / this.getTemperaturas().size() );	
	}
	
	
	private double convertirCelsius(double temperatura) {
		return (temperatura - 32) / 1.8 ;
	}
}
