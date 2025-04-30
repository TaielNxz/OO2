package ar.edu.unlp.info.oo2.ejercicio_14_PrestamosPrendarios;

import java.time.LocalDate;

public class Automovil implements Prenda {

    private String modelo;
    private int kilometraje;
    private double costo0km;
    private int anioFabricacion;
    
    public Automovil(String modelo, int kilometraje, double costo0km, int anioFabricacion) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.costo0km = costo0km;
        this.anioFabricacion = anioFabricacion;
    }
    
    @Override
	public double valor() {
		int antiguedad = LocalDate.now().getYear() - anioFabricacion;
		double reduccion = 0.1 * antiguedad;
		reduccion = Math.min(reduccion, 1.0); // No puede ser mayor al 100%
        return costo0km * (1 - reduccion);
	}

	@Override
	public double liquidez() {
		return 0.7;
	}

	
	
}
