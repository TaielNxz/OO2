package ar.edu.unlp.info.oo2.ejercicio_04_CalculoDeSueldos;

public abstract class ConFamilia extends Empleado {

	private boolean casado;
	private int cantHijos;
	
	public ConFamilia( String nombre , boolean casado , int cantHijos ) {
		super(nombre);
		this.casado = casado;
		this.cantHijos = cantHijos;
	}
	
	
	public boolean isCasado() {
		return this.casado;
	}
	

	public int getCantHijos() {
		return this.cantHijos;
	}
	
	
	public double sueldoAdicional() {
		
		double adicional = 2000 * this.getCantHijos();
		
		return this.isCasado() ? adicional + 5000 
							   : adicional ;

	}

}
