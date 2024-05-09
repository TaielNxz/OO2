package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

public class DatoCelsius extends Dato {

	public DatoCelsius(Temperatura componente) {
		super(componente);
	}
	

	public String displayData() {
		return super.displayData() + " Temperatura Celsius: " + Math.round(this.getTemperturaCelsius()) + "\n";
	}
	
	
	public double getTemperturaCelsius(){
		return ( this.getTemperatura() - 32 ) / 1.8 ;
	}

}
