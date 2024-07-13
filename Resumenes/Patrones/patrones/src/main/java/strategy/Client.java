package strategy;

public class Client {

    public static void main(String[] args) {
    	
        // Crear las estrategias concretas
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();
        Strategy strategyC = new ConcreteStrategyC();

        // Crear el contexto y establecer la estrategia inicial
        Context context = new Context(strategyA);
        context.enviarPedido(); // Salida: Metodo de envio A

        // Cambiar la estrategia en tiempo de ejecución
        context.setStrategy(strategyB);
        context.enviarPedido(); // Salida: Metodo de envio B

        // Cambiar a otra estrategia
        context.setStrategy(strategyC);
        context.enviarPedido(); // Salida: Metodo de envio C
        
    }
    
}
