package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private List<AutoEnAlquiler> autos;
	
	public Usuario( String nombre ) {
		this.nombre = nombre;
		this.autos = new ArrayList<AutoEnAlquiler>();
	}
	
	public void alquilarAuto(AutoEnAlquiler auto) {
		this.autos.add(auto);
	}

	/*
	 * Getters y Setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AutoEnAlquiler> getAutos() {
		return autos;
	}

	public void setAutos(List<AutoEnAlquiler> autos) {
		this.autos = autos;
	}

}
