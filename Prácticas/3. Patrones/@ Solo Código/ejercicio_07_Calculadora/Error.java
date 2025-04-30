package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

public class Error extends Estado {

	public Error(Calculadora calculadora) {
		super(calculadora);
	}
	
	/**
	  * Si la calculadora se encuentra en error, devuelve “error”
	*/
	public String getResultado() {
		return "error";
	}

	public void setValor(double unValor) {
		// No hace nada en estado de error
	}
	
	public void mas() {
		// No hace nada en estado de error
	}
	 
	public void menos() {
		// No hace nada en estado de error
	}
	 
	public void por() {
		// No hace nada en estado de error
	}
	 
	public void dividido() {
		// No hace nada en estado de error
	}

}
