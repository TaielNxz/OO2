package ar.edu.unlp.info.oo2.ejercicio_04_CalculoDeSueldos;

public class Pasante extends Empleado {

	private int cantExamenes;
	
	public Pasante( String nombre , int cantExamenes ) {
		super( nombre );
		this.cantExamenes = cantExamenes;
	}
	
	
	public double sueldoBasico() {
		return 20000;
	}

	
	public double sueldoAdicional() {
		return this.cantExamenes * 2000;
	}

}
