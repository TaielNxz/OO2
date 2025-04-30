package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs;

public class Catalogo {

	public Componente getComponente(String nombre) {
		return new Componente(nombre, 0, 0, 0);
	}
	
}
