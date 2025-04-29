package ar.edu.unlp.info.oo2.ejercicio_14_PrestamosPrendarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Prenda {

    private LocalDate inicioContrato;
    private LocalDate finContrato;
    private double costoMensual;
    
    public Alquiler(LocalDate inicioContrato, LocalDate finContrato, double costoMensual) {
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
    }

    @Override
    public double valor() {
        double mesesFaltantes = ChronoUnit.MONTHS.between(LocalDate.now(), finContrato);
        return mesesFaltantes * costoMensual;
    }

    @Override
    public double liquidez() {
        return 0.9;
    }

}
