package ar.edu.unlp.info.oo2.ejercicio_14_PrestamosPrendarios;

import java.util.ArrayList;
import java.util.List;

public class PrendaCombinada {

	private List<Prenda> prendas;
	
	public PrendaCombinada() {
		this.prendas = new ArrayList<Prenda>();
	}

    public void agregarPrenda(Prenda prenda) {
    	prendas.add(prenda);
    }

    public double valor() {
        return prendas.stream()
        		.mapToDouble(Prenda::valor) // p -> p.valor() es lo mismo
        		.sum();
    }

    public double liquidez() {
        return 0.5;
    }

    public double valorPrendario() {
        return this.valor() * this.liquidez();
    }
	
}
