package ar.edu.unlp.info.oo2.ejercicio_02_CalculoDeSueldos;

public class EmpleadoPlanta extends EmpleadoConFamilia {

	private int antiguedad;
	
	public EmpleadoPlanta( String nombre, boolean casado, int cantHijos, int antiguedad ) {
		super( nombre, casado, cantHijos );
		this.antiguedad = antiguedad;
	}
	
	public double sueldoBasico() {
		return 50000;
	}
	
	public double sueldoAdicional() {
		return super.sueldoAdicional() + ( 2000 * antiguedad );
	}
	
}
