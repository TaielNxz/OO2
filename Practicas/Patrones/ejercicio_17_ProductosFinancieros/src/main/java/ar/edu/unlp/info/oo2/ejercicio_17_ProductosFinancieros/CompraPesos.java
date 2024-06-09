package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;

public class CompraPesos extends Compra {

	public CompraPesos(double valorCompra) {
		super(valorCompra);
	}

	@Override
	public LocalDate ganancia() {
		return null;
	}

}
