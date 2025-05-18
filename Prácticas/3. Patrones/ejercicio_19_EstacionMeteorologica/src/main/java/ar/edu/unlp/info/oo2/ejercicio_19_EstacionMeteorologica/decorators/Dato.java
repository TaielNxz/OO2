package ar.edu.unlp.info.oo2.ejercicio_19_EstacionMeteorologica;

import java.util.List;

public abstract class Dato implements Temperatura {

	private Temperatura componente;
	
	
	public Dato( Temperatura componente ) {
		this.componente = componente;
	}
	

	@Override
	public String displayData() {
		return this.componente.displayData();
	}

	
	@Override
	public double getTemperatura() {
		return this.componente.getTemperatura();
	}
	

	@Override
	public double getPresion() {
		return this.componente.getPresion();
	}

	
	@Override
	public double getRadiacionSolar() {
		return this.componente.getRadiacionSolar();
	}

	
	@Override
	public List<Double> getTemperaturas() {
		return this.componente.getTemperaturas();
	}

}
