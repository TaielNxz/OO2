package ar.edu.unlp.info.oo2.ejercicio_16_EstacionMeteorologica;

import java.util.List;

public interface Temperatura {
	
	public abstract double getTemperatura();
	
	public abstract double getPresion();
	
	public abstract double getRadiacionSolar();
	
	public abstract List<Double> getTemperaturas();
	
	public abstract String displayData();

}
