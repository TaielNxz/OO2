package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

public class EsperandoOperador implements Estado {

	Calculadora calculadora;

	public EsperandoOperador(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	
	
	/**
	 * Devuelve el resultado actual de la operación realizada.
	 * Si no se ha realizado ninguna operación, devuelve el valor acumulado.
	 * Si la calculadora se encuentra en error, devuelve “error”
	*/
	 public String getResultado() {
		 return this.calculadora.getValorAcumulado().toString();
	 }
	 
	
	/**
	* Asigna un valor para operar.
	* si hay una operación en curso, el valor será utilizado en la operación
	*/
	public void setValor(double unValor) {
		this.calculadora.setValorAcumulado(unValor);
	}

	/**
	  * Indica que la calculadora debe esperar un nuevo valor.
	  * Si a continuación se le envía el mensaje setValor(), la calculadora sumará el 
	  * valor recibido como parámetro, al valor actual y guardará el resultado
    */
	 public void mas() {
		 this.calculadora.setState(new Sumando(this.calculadora));
	 }
	 
	 public void menos() {
		 this.calculadora.setState(new Restando(this.calculadora));
	 }
	 
	 public void por() {
		 this.calculadora.setState(new Multiplicando(this.calculadora));
	 }
	 
	 public void dividido() {
		 this.calculadora.setState(new Dividiendo(this.calculadora));
	 }

}
