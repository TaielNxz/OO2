package ar.edu.unlp.info.oo2.ejercicio_17_ProductosFinancieros;

import java.time.LocalDate;

public class ProductoFinancieroBuilder {
	
    private LocalDate fechaOperacion;
    private ProductoCombinado productoCombinado;
    private String membresia;

    
    public ProductoFinancieroBuilder( LocalDate fechaOperacion , String membresia ) {
        this.fechaOperacion = fechaOperacion;
        this.productoCombinado = new ProductoCombinado(fechaOperacion);
        this.membresia = membresia;
    }
    

    public ProductoFinancieroBuilder agregarCompraDolares() {
        productoCombinado.agregarProducto( new CompraDolares(fechaOperacion) );
        return this;
    }

    
    public ProductoFinancieroBuilder agregarCompraPesos() {
        productoCombinado.agregarProducto( new CompraPesos(fechaOperacion) );
        return this;
    }
    
    
    public ProductoFinancieroBuilder agregarBonoAltoRiesgo( int parking ) {
        productoCombinado.agregarProducto( new BonoAltoRiesgo( fechaOperacion , parking ) );
        return this;
    }
    
    
    public ProductoFinancieroBuilder agregarBonoBajoRiesgo( int parking ) {
        productoCombinado.agregarProducto( new BonoBajoRiesgo( fechaOperacion, parking ) );
        return this;
    }
    

    public ProductoFinancieroBuilder agregarPlazoFijo( int cantidadDias, double interes ) {
        productoCombinado.agregarProducto( new PlazoFijo(fechaOperacion, cantidadDias, interes) );
        return this;
    }
    

    public ProductoCombinado crearProducto1() {
        if (membresia.equals("Silver")) {
            return this.agregarCompraDolares()
                       .agregarPlazoFijo(35, 0.05)
                       .agregarCompraPesos()
                       .productoCombinado;
        } else if (membresia.equals("Gold")) {
            return this.agregarCompraDolares()
                       .agregarPlazoFijo(30, 0.06)
                       .agregarCompraPesos()
                       .productoCombinado;
        } else {
            throw new IllegalArgumentException("Membresía no válida");
        }
    }

    public ProductoCombinado crearProducto2() {
        if (membresia.equals("Silver")) {
            return this.agregarBonoAltoRiesgo(72)
                       .agregarCompraDolares()
                       .agregarPlazoFijo(35, 0.05)
                       .agregarCompraPesos()
                       .productoCombinado;
        } else if (membresia.equals("Gold")) {
            return this.agregarBonoAltoRiesgo(24)
                       .agregarCompraDolares()
                       .agregarPlazoFijo(30, 0.06)
                       .agregarCompraPesos()
                       .productoCombinado;
        } else {
            throw new IllegalArgumentException("Membresía no válida");
        }
    }

    public ProductoCombinado crearProducto3() {
        if (membresia.equals("Gold")) {
            return this.agregarBonoAltoRiesgo(24)
                       .agregarBonoBajoRiesgo(24)
                       .agregarPlazoFijo(30, 0.06)
                       .productoCombinado;
        } else {
            throw new IllegalArgumentException("Producto no disponible para membresía Silver");
        }
    }

    public ProductoCombinado crearProducto4() {
        if (membresia.equals("Gold")) {
            return this.agregarBonoAltoRiesgo(24)
                       .agregarBonoAltoRiesgo(24)
                       .agregarBonoAltoRiesgo(24)
                       .productoCombinado;
        } else {
            throw new IllegalArgumentException("Producto no disponible para membresía Silver");
        }
    }

}
