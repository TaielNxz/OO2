package builder;

public class Product {

    // Ingredientes de la pizza
    private String masa;
    private String queso;
    private String salsa;
    
	public String getMaza() {
		return masa;
	}

	public String getQueso() {
		return queso;
	}

	public String getSalsa() {
		return salsa;
	}

	@Override
	public String toString() {
		return "Product [masa=" + masa + ", queso=" + queso + ", salsa=" + salsa + "]";
	}
	
}
