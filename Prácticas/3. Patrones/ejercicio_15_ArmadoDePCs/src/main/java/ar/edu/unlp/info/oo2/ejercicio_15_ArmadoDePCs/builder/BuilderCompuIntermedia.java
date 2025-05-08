package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.builder;

import java.time.LocalDate;

import ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.Catalogo;
import ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.Compu;

public class BuilderCompuIntermedia implements BuilderCompu {

    private Compu compu;
    private Catalogo catalogo;

    @Override
	public void armarCompu(String cliente, LocalDate fecha) {
    	this.compu = new Compu("Intermedia", cliente, fecha);
    	this.catalogo = new Catalogo();
	}
    
    @Override
	public Compu build() {
		return this.compu;
	}

	@Override
	public void agregarProcesador() {
		this.compu.agregarComponente(catalogo.getComponente("Procesador Intermedio"));
	}

	@Override
	public void agregarRAM() {
		this.compu.agregarComponente(catalogo.getComponente("RAM 16gb"));
	}

	@Override
	public void agregarDisco() {
		this.compu.agregarComponente(catalogo.getComponente("SSD 500gb"));
	}

	@Override
	public void agregarGrafica() {
		this.compu.agregarComponente(catalogo.getComponente("GTX 1650"));	
	}

	@Override
	public void agregarGabinete() {
		this.compu.agregarComponente(catalogo.getComponente("Gabinete Intermedio"));
		this.compu.agregarComponente(catalogo.getComponente("Fuente 800W"));
	}

}
