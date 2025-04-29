package ar.edu.unlp.info.oo2.ejercicio_14_PrestamosPrendarios;

public interface Prenda {
	
    public double valor();
    
    public double liquidez();
    
    default double valorPrendario() {
        return valor() * liquidez();
    }
    
}
