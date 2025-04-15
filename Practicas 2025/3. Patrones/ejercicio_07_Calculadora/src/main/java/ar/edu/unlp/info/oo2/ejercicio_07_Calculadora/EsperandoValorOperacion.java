package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

public class EsperandoValorOperacion extends Estado {

	private String operacion;
	
	public EsperandoValorOperacion(Calculadora calculadora, String operacion) {
		super(calculadora);
		this.operacion = operacion;
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
		
		double resultado;
		
		// NO ME GUSTA ESTO
        switch (this.operacion) {
            case "+":
                resultado = this.calculadora.getValorAcumulado() + unValor;
                break;
            case "-":
                resultado = this.calculadora.getValorAcumulado() - unValor;
                break;
            case "*":
                resultado = this.calculadora.getValorAcumulado() * unValor;
                break;
            case "/":
                if (unValor == 0) {
                	this.calculadora.setState(new Error(this.calculadora));
                    return;
                }
                resultado = this.calculadora.getValorAcumulado() / unValor;
                break;
            default:
                return;
        }
		
        this.calculadora.setValorAcumulado(resultado);
        this.calculadora.setValorActual(unValor);
        this.calculadora.setState(new EsperandoValor(this.calculadora));
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
