package ar.edu.unlp.info.oo2.ejercicio_02_CalculoDeSueldos;

public class EmpleadoPasante extends Empleado {

	private int cantExamenes;
	
	public EmpleadoPasante( String nombre , int cantExamenes ) {
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
