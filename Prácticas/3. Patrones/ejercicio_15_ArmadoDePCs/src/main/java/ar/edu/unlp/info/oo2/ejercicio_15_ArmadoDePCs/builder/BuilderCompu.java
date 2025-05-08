package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs;

import java.time.LocalDate;

public interface BuilderCompu {
	
	void armarCompu(String cliente, LocalDate fecha);
	Compu build();
    void agregarProcesador();
    void agregarRAM();
    void agregarDisco();
    void agregarGrafica();
    void agregarGabinete();
    
}