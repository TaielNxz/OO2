package ar.edu.unlp.info.oo2.ejercicio_02_CalculoDeSueldos;

public class EmpleadoTemporario extends EmpleadoConFamilia {

	int cantHoras;
	
	public EmpleadoTemporario( String nombre, boolean casado, int cantHijos, int cantHoras ) {
		super( nombre, casado, cantHijos );
		this.cantHoras = cantHoras;
	}

	public double sueldoBasico() {
		return 20000 + ( this.cantHoras * 300 );
	}
	
	public double sueldoAdicional() {
		return super.sueldoAdicional();
	}

}
