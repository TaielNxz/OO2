package ar.edu.unlp.info.oo2.ejercicio_04_CalculoDeSueldos;

public abstract class Empleado {

	private String nombre;

	public Empleado( String nombre ) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return this.nombre;
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
