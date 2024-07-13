package template_method;

// La tarea de calcular el precio de la comida y la bebida es delegada a las subclases
// La estructura del metodo "calcularTotal" sigue siendo la misma independientemente del comportamiento que se le de a las subclases
// Las diferentes subclases redefinen los metodos "calcularComida()" y "calcularBebida()"

public abstract class AbstractClass {
	
	public double calcularTotal() {
		return calcularComida() + calcularBebida();
	}
	
	public abstract double calcularComida();
	
	public abstract double calcularBebida();
	
}
