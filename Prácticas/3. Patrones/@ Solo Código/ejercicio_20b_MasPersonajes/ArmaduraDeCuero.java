package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes;

public class ArmaduraDeCuero extends Armadura {
	
    @Override
    public int recibirAtaque(int danio) {
        return danio;  // No hay reducción de daño
    }
    
}
