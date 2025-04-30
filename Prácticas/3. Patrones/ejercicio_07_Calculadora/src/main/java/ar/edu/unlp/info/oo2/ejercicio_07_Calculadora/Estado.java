package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

public interface Estado {
	
	public abstract String getResultado();
	public abstract void setValor(double unValor);
	public abstract void mas();
	public abstract void menos(); 
	public abstract void por();
	public abstract void dividido();
	
}
