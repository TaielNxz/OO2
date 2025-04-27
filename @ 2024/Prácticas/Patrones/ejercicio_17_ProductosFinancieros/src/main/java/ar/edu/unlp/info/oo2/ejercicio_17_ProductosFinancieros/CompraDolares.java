package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;

public class CompraDolares extends ProductoFinanciero {
    
    private static final double valorCompra = 1000;

    public CompraDolares(LocalDate fechaOperacion) {
        super(fechaOperacion);
    }

    @Override
    public double retornoInversion(double montoInicial) { // se recibe un monto en pesos
    	
        // Calcula la cantidad de dólares que se obtienen al convertir el monto inicial en pesos
        double cantidadDolares = montoInicial / valorCompra;
        
        // Redondea a dos decimales
        cantidadDolares = Math.round(cantidadDolares * 100.0) / 100.0;
        
        return cantidadDolares;
        
    }
    
}
