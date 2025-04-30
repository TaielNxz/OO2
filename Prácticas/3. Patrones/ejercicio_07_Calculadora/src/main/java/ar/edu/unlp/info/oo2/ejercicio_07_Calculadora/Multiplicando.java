package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

public class Multiplicando extends Operando {
	
    public Multiplicando(Calculadora calculadora) {
        super(calculadora);
    }

    @Override
    public void setValor(double unValor) {
        double resultado = this.calculadora.getValorAcumulado() * unValor;
        this.finalizarOperacion(resultado, unValor);
    }
    
}
