package ar.edu.unlp.info.oo2.ejercicio_15_ArmadoDePCs;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compu {

    private String nombreConfiguracion;
    private List<Componente> componentes;
    private String cliente;
    private LocalDate fechaPresupuesto;
    
    public Compu(String nombreConfiguracion, String cliente, LocalDate fechaPresupuesto) {
        this.nombreConfiguracion = nombreConfiguracion;
        this.cliente = cliente;
        this.fechaPresupuesto = fechaPresupuesto;
        this.componentes = new ArrayList<>();
    }
    
    
    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }
    
    public double calcularConsumoTotal() {
        return componentes.stream()
        		.mapToDouble(Componente::getConsumo)
        		.sum();
    }
    
    public double calcularPrecioTotal() {
        double subtotal = componentes.stream()
        		.mapToDouble(Componente::getPrecio)
        		.sum();
        return subtotal * 1.21;
    }
   
    public String getNombreConfiguracion() { 
    	return nombreConfiguracion; 
	}
    
    public List<Componente> getComponentes() { 
    	return componentes; 
	}
    
    public String getCliente() { 
    	return cliente; 
	}
    
    public LocalDate getFechaPresupuesto() { 
    	return fechaPresupuesto; 
	}
    
}
