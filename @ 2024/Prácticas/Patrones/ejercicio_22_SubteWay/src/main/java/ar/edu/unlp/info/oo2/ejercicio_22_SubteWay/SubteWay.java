package ar.edu.unlp.info.oo2.ejercicio_22_SubteWay;

public class SubteWay {
	
	private BuilderSanguche builder;
	
	public SubteWay( BuilderSanguche builder ) {
		this.builder = builder;
	}
	
	public void setBuilder( BuilderSanguche builder ) {
		this.builder = builder;
	}

	public Sanguche construirSanguche() {
		this.builder.nuevoSanguche();
		this.builder.agregarPan();
		this.builder.agregarAderezo();
		this.builder.agregarPrincipal();
		this.builder.agregarAdicional();
		return this.builder.build();
	}
	
}
