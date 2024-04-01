package ar.edu.unlp.info.oo2.ejercicio_04_CalculoDeSueldos;

public class Planta extends Empleado {

	private int antiguedad;
	
	public Planta( String nombre, boolean casado, int cantHijos, int antiguedad ) {
		super( nombre, casado, cantHijos);
		this.antiguedad = antiguedad;
	}

	
	public double sueldoBasico() {
		return 50000;
	}

	
	public double sueldoAdicional() {
		
		double adicional = ( 2000 * this.getCantHijos() ) + ( 2000 * antiguedad );
		
		return this.isCasado() ? adicional + 5000 
							   : adicional ;
	}



}
