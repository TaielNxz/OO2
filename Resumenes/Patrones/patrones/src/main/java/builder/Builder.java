package builder;

public abstract class Builder {
	
	public Product pizza;
	
    public abstract void agregarMasa(String masa);
    
    public abstract void agregarQueso(String queso);
    
    public abstract void agregarSalsa(String salsa);

    public Product crearPizza() {
    	return this.pizza = new Product();
    }
    
	public Product build() {
		return this.pizza;
	}
	
}

