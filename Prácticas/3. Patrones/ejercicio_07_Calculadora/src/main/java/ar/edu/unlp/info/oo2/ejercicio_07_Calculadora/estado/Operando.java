package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora.estado;

import ar.edu.unlp.info.oo2.ejercicio_07_Calculadora.Calculadora;

public abstract class Operando implements Estado {
	
	protected Calculadora calculadora;
	
	public Operando(Calculadora calculadora) {
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
	public abstract void setValor(double unValor);
	
	
	/**
	* Metodo que me inventé para no repetir esto en cada sublcase.
	* se almacenan los valores y se cambia de estado
	*/
    protected void finalizarOperacion(double resultado, double valorActual) {
        this.calculadora.setValorAcumulado(resultado);
        this.calculadora.setValorActual(valorActual);
        this.calculadora.setState(new ListoParaOperar(this.calculadora));
    }
    
	
	/**
	  * Indica que la calculadora debe esperar un nuevo valor.
	  * Si a continuación se le envía el mensaje setValor(), la calculadora sumará el 
	  * valor recibido como parámetro, al valor actual y guardará el resultado
    */
	 public void mas() {
		 this.calculadora.setState(new Error(this.calculadora));
	 }
	 
	 public void menos() {
		 this.calculadora.setState(new Error(this.calculadora));
	 }
	 
	 public void por() {
		 this.calculadora.setState(new Error(this.calculadora));
	 }
	 
	 public void dividido() {
		 this.calculadora.setState(new Error(this.calculadora));
	 }
	
}
