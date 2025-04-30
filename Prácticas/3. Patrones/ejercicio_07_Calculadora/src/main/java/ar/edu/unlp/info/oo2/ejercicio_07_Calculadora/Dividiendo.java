package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

public class Dividiendo extends Operando {

	public Dividiendo(Calculadora calculadora) {
		super(calculadora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValor(double unValor) {
	    if (unValor == 0) {
	        this.calculadora.setState(new Error(this.calculadora));
	        return;
	    }
	    double resultado = this.calculadora.getValorAcumulado() / unValor;
	    this.finalizarOperacion(resultado, unValor);
	}

}
