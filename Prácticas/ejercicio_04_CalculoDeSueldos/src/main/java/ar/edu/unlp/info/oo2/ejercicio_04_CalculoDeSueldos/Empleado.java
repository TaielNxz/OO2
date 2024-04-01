package ar.edu.unlp.info.oo2.ejercicio_04_CalculoDeSueldos;

public abstract class Empleado {

	private String nombre;
	private boolean casado;
	private int cantHijos;

	public Empleado( String nombre,  boolean casado, int cantHijos ) {
		this.nombre = nombre;
		this.casado = casado;
		this.cantHijos = cantHijos;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public boolean isCasado() {
		return this.casado;
	}
	

	public int getCantHijos() {
		return this.cantHijos;
	}
	
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
	
	
	public double descuento() {
		return ( this.sueldoBasico() * 0.13 ) + ( this.sueldoAdicional() * 0.05 );
	}
	

	public abstract double sueldoBasico();
	
	public abstract double sueldoAdicional();
	

}
