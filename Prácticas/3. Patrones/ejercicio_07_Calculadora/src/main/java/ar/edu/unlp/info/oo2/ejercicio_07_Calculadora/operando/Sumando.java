package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora.operando;

import ar.edu.unlp.info.oo2.ejercicio_07_Calculadora.Calculadora;
import ar.edu.unlp.info.oo2.ejercicio_07_Calculadora.estado.Operando;

public class Sumando extends Operando {

	public Sumando(Calculadora calculadora) {
		super(calculadora);
	}

	@Override
	public void setValor(double unValor) {
	    double resultado = this.calculadora.getValorAcumulado() + unValor;
	    this.finalizarOperacion(resultado, unValor);
	}

}
