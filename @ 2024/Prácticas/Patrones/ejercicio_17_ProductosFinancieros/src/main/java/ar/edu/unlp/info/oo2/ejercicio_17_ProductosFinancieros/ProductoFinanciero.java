package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
	
    protected LocalDate fechaOperacion;

    public ProductoFinanciero(LocalDate fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }

    public abstract double retornoInversion(double montoInicial);

}
