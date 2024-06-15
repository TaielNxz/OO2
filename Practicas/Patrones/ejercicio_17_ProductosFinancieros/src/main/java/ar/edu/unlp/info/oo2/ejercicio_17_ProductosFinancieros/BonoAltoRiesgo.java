package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;

public class BonoAltoRiesgo extends ProductoFinanciero {

    private int parking;
    private static final double max_variacion = 0.70;

    public BonoAltoRiesgo(LocalDate fechaOperacion, int parking) {
        super(fechaOperacion);
        this.parking = parking;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }

    @Override
    public double retornoInversion(double montoInicial) {
        // Simulando la variación aleatoria dentro del rango permitido
        double variacion = 1 + (Math.random() * max_variacion * 2 - max_variacion);
        
        // Ajuste del cálculo en función del parking (usando una fórmula de interés compuesto)
        double retorno = montoInicial * Math.pow(variacion, (double) this.parking / 24);
        
        // Redondear a dos decimales
        retorno = Math.round(retorno * 100.0) / 100.0;
        
        return retorno;
    }
}
