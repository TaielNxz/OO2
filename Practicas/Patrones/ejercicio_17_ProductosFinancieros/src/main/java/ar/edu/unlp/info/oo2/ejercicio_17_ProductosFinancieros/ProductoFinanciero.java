package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;

public abstract class ProductoFinanciero {

	private LocalDate fechaOperacion;
	
	public abstract LocalDate ganancia();
	
}
