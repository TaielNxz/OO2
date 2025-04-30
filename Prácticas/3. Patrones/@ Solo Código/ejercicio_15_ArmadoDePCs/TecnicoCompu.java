package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs;

import java.time.LocalDate;

public class TecnicoCompu {
	
    private BuilderCompu builder;
    
	public void setBuilder(BuilderCompu builder) {
        this.builder = builder;
    }
    
    public Compu construirPC(String cliente, LocalDate fecha) {
    	this.builder.armarCompu(cliente, fecha);
        this.builder.agregarProcesador();
        this.builder.agregarRAM();
        this.builder.agregarDisco();
        this.builder.agregarGrafica();
        this.builder.agregarGabinete();
        return this.builder.build();
    }
    
}
