package strategy;

public class ConcreteStrategyA implements Strategy {

	@Override
	public void enviar() {
		System.out.println("Metodo de envio A");
	}

}
