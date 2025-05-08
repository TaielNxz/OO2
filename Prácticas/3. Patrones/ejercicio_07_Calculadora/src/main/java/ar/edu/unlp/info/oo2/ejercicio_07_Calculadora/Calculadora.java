package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

import ar.edu.unlp.info.oo2.ejercicio_07_Calculadora.estado.EsperandoValorInicial;
import ar.edu.unlp.info.oo2.ejercicio_07_Calculadora.estado.Estado;

public class Calculadora {

	Estado state;
	Double valorAcumulado;
	Double valorActual;
	
	public Calculadora() {
		this.state = new EsperandoValorInicial(this);
		this.valorAcumulado = 0.0;
		this.valorActual = 0.0;
	}
	

	// Getters y Setters
	 public Estado getState() {
		return state;
	}


	public void setState(Estado state) {
		this.state = state;
	}


	public Double getValorAcumulado() {
		return valorAcumulado;
	}


	public void setValorAcumulado(Double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
	
	
	public Double getValorActual() {
		return valorActual;
	}


	public void setValorActual(Double valorActual) {
		this.valorActual = valorActual;
	}
	
	
	/**
	 * Devuelve el resultado actual de la operación realizada.
	 * Si no se ha realizado ninguna operación, devuelve el valor acumulado.
	 * Si la calculadora se encuentra en error, devuelve “error”
	*/
	 public String getResultado() {
		 return state.getResultado();
	 }


	/**
      * Pone en cero el valor acumulado y reinicia la calculadora
	 */
	 public void borrar() {
		 this.state = new EsperandoValorInicial(this);
	 	 this.valorAcumulado = 0.0;
	 }
	 
	 
	 /**
      * Asigna un valor para operar.
      * si hay una operación en curso, el valor será utilizado en la operación
	 */
	 public void setValor(double unValor) {
		 this.state.setValor(unValor);
	 }
	 
	 
	 /**
	  * Indica que la calculadora debe esperar un nuevo valor.
	  * Si a continuación se le envía el mensaje setValor(), la calculadora sumará el 
	  * valor recibido como parámetro, al valor actual y guardará el resultado
     */
	 public void mas() {
		 this.state.mas();
	 }
	 
	 public void menos() {
		 this.state.menos();
	 }
	 
	 public void por() {
		 this.state.por();
	 }
	 
	 public void dividido() {
		 this.state.dividido();
	 }

}
