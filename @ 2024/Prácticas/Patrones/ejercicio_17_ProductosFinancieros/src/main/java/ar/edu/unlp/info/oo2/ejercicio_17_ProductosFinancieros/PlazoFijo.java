package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;

public class PlazoFijo extends ProductoFinanciero {
	
    private int cantidadDias;
    private double interes;

    
    public PlazoFijo( LocalDate fechaOperacion, int cantidadDias, double interes ) {
        super(fechaOperacion);
        this.cantidadDias = cantidadDias;
        this.interes = interes;
    }
    

    @Override
    public double retornoInversion( double montoInicial ) {
    	
        // Calcular el retorno de inversión usando el interés compuesto
        double montoFinal = montoInicial * Math.pow(1 + interes, cantidadDias);
        
        // Redondear a dos decimales
        montoFinal = Math.round(montoFinal * 100.0) / 100.0;
        
        return montoFinal;

    }
    
   
}