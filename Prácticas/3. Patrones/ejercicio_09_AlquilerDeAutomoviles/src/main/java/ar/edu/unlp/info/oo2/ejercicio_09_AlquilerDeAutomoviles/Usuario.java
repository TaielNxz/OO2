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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void alquilarAuto(AutoEnAlquiler auto) {
		this.autos.add(auto);
	}

}
