package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora.estado;

public interface Estado {

	public String getResultado();
	public void setValor(double unValor);
	public void mas();
	public void menos(); 
	public void por();
	public void dividido();
	
}
