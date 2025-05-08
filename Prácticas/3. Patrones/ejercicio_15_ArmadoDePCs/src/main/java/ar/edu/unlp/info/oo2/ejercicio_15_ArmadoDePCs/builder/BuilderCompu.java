package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.builder;

import java.time.LocalDate;

import ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.Compu;

public interface BuilderCompu {
	
	public void armarCompu(String cliente, LocalDate fecha);
	public void agregarProcesador();
	public void agregarRAM();
	public void agregarDisco();
	public void agregarGrafica();
	public void agregarGabinete();
	public Compu build();
    
}