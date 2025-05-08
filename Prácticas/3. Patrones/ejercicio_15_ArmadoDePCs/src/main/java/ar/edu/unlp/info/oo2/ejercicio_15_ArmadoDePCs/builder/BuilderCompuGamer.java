package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.builder;

import java.time.LocalDate;

import ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.Catalogo;
import ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs.Compu;

public class BuilderCompuGamer implements BuilderCompu {

    private Compu compu;
    private Catalogo catalogo; 
    
    @Override
	public void armarCompu(String cliente, LocalDate fecha) {
    	this.compu = new Compu("Gamer", cliente, fecha);
    	this.catalogo = new Catalogo();
	}
    
    @Override
	public Compu build() {
		return this.compu;
	}
    
    @Override
	public void agregarProcesador() {
        this.compu.agregarComponente(catalogo.getComponente("Procesador Gamer"));
        this.compu.agregarComponente(catalogo.getComponente("Pad térmico"));
        this.compu.agregarComponente(catalogo.getComponente("Cooler"));
	}

    @Override
	public void agregarRAM() {
        this.compu.agregarComponente(catalogo.getComponente("RAM 32gb"));
        this.compu.agregarComponente(catalogo.getComponente("RAM 32gb"));
	}

    @Override
	public void agregarDisco() {
		this.compu.agregarComponente(catalogo.getComponente("SSD 500GB"));
		this.compu.agregarComponente(catalogo.getComponente("SSD 1TB"));
	}

    @Override
	public void agregarGrafica() {
		this.compu.agregarComponente(catalogo.getComponente("RTX 4090"));
	}

    @Override
	public void agregarGabinete() {
		this.compu.agregarComponente(catalogo.getComponente("Gabinete Gamer"));
		
        // Calcular consumo de la fuente
        double consumoTotal = this.compu.calcularConsumoTotal();
        double fuenteW = consumoTotal * 1.5;
        this.compu.agregarComponente(catalogo.getComponente("Fuente " + (int)fuenteW + " W"));
	}

}
