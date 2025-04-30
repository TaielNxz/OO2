package ar.edu.unlp.info.oo2.ejercicio_14_PrestamosPrendarios;

public class Inmueble implements Prenda {

    private String direccion;
    private double superficie;
    private double costoM2;
    
	public Inmueble(String direccion, double superficie, double costoM2) {
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoM2 = costoM2;
	}

	@Override
	public double valor() {
		return this.superficie * this.costoM2;
	}

	@Override
	public double liquidez() {
		return 0.2;
	}

}
