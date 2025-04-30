package ar.edu.unlp.info.oo2.ejercicio_19_EstacionMeteorologica;

public class DatoTemperaturas extends Dato {

	
	public DatoTemperaturas(Temperatura componente) {
		super(componente);
	}
	
	
	public String displayData() {
		return super.displayData() + " Lista de Temperaturas (°F): " + this.getTemperaturas().toString() + "\n";
	}
	
	
}
