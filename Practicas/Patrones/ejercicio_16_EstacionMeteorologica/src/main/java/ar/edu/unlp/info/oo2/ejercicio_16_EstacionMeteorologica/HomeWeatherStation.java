package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {

	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	
	
	public HomeWeatherStation( double temperatura , double presion , double radiacionSolar ) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = new ArrayList<Double>();
	}

	
	// retorna la temperatura en grados Fahrenheit.
	public double getTemperatura() {
		return this.temperatura;
	}
	
	 
	// retorna la presión atmosférica en hPa
	public double getPresion() {
		return this.presion;
	}
	 
	 
	// retorna la radiación solar
	public double getRadiacionSolar() {
		return this.radiacionSolar;
	}
	 
	 
	// retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas() {
		return this.temperaturas;
	}
	 
	
	// retorna un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData(){
		 return  " Temperatura F: " + this.getTemperatura() + "\n" +
				 " Presion atmosf: " + this.getPresion() + "\n" +
				 " Radiacion solar: " + this.getRadiacionSolar() + "\n";
	}

}
