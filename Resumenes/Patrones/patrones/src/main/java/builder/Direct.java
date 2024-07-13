package builder;

public class Direct {

	private Builder builder;
	
	public Direct( Builder builder ) {
		this.builder = builder;
	}

	public Product construirPizza1() {
		this.builder.crearPizza();
		this.builder.agregarMasa("Masa 1");
		this.builder.agregarQueso("Queso 1");
		this.builder.agregarSalsa("Salsa 1");
		return this.builder.build();
	}
	
}
