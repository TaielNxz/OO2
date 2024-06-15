package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductoCombinado extends ProductoFinanciero {
	
    private List<ProductoFinanciero> productos;

    public ProductoCombinado( LocalDate fechaOperacion ) {
        super(fechaOperacion);
        productos = new ArrayList<>();
    }
    
    
    public void agregarProducto( ProductoFinanciero producto) {
        productos.add(producto);
    }
    
    
    @Override
    public double retornoInversion(double montoInicial) {
    	return this.productos.stream()
    				.mapToDouble( producto -> producto.retornoInversion(montoInicial) )
    				.sum();
    }

}