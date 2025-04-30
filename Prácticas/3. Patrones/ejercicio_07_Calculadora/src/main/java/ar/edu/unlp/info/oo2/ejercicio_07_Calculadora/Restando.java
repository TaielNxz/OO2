package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

public class Restando extends Operando {

	public Restando(Calculadora calculadora) {
		super(calculadora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setValor(double unValor) {
	    double resultado = this.calculadora.getValorAcumulado() - unValor;
	    this.finalizarOperacion(resultado, unValor);
	}
    
}
