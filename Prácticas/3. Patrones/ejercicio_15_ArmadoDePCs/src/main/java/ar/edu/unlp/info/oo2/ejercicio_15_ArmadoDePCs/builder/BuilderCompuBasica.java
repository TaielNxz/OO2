package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.builder;

import java.time.LocalDate;

import ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.Catalogo;
import ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.Compu;

public class BuilderCompuBasica implements BuilderCompu {

    private Compu compu;
    private Catalogo catalogo;
    
    @Override
	public void armarCompu(String cliente, LocalDate fecha) {
    	this.compu = new Compu("Básica", cliente, fecha);
    	this.catalogo = new Catalogo();
	}
    
    @Override
	public void agregarProcesador() {
		this.compu.agregarComponente(catalogo.getComponente("Procesador Básico"));
	}

	@Override
	public void agregarRAM() {
		this.compu.agregarComponente(catalogo.getComponente("8 GB RAM"));
	}

	@Override
	public void agregarDisco() {
		this.compu.agregarComponente(catalogo.getComponente("HDD 500 GB"));
	}

	@Override
	public void agregarGrafica() {
		
	}

	@Override
	public void agregarGabinete() {
		this.compu.agregarComponente(catalogo.getComponente("Gabinete Estándar"));
	}

    @Override
	public Compu build() {
		return this.compu;
	}
    
}
