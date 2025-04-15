package ar.edu.unlp.info.oo2.ejercicio_07_Calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	Calculadora calc;
	
	@Test
	void test() {
		Calculadora calc = new Calculadora();
		calc.setValor(5); // Establece el valor inicial
		calc.mas(); // Prepara para sumar
		calc.setValor(3); // Suma 3 al valor acumulado
		System.out.println(calc.getResultado()); // Imprimirá "8.0"
		calc.por();
		calc.setValor(2);
		assertEquals(calc.getResultado(), "16.0");
	}

}
