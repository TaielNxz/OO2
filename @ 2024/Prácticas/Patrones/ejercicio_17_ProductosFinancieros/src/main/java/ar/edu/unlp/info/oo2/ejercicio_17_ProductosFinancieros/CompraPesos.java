package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;

public class CompraPesos extends ProductoFinanciero {
    
	private static final double valorCompra = 1000;

    public CompraPesos(LocalDate fechaOperacion) {
        super(fechaOperacion);
    }

    @Override
    public double retornoInversion(double montoInicial) { // se recibe un monto en dolares
    	
        // Calcula la cantidad de pesos que se obtienen al convertir el monto inicial en dólares
        double cantidadPesos = montoInicial * valorCompra;
        
        // Redondea a dos decimales 
        cantidadPesos = Math.round(cantidadPesos * 100.0) / 100.0;
        
        return cantidadPesos;
        
    }
    
}
