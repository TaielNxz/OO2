package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles.politica_de_cancelacion.PoliticaCancelacion;

public class AutoEnAlquiler {

	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
    private PoliticaCancelacion politicaCancelacion;  
    
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
	}
	
	/*
	 * Getters y Setters
	 */
	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	public int getCantidadPlazas() {
		return cantidadPlazas;
	}

	public void setCantidadPlazas(int cantidadPlazas) {
		this.cantidadPlazas = cantidadPlazas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public PoliticaCancelacion getPoliticaCancelacion() {
		return politicaCancelacion;
	}
	
	public void setPoliticaCancelacion(PoliticaCancelacion politicaCancelacion) {
		this.politicaCancelacion = politicaCancelacion;
	}
	
}
