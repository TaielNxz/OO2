package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armaduras;

public class ArmaduraDeAcero extends Armadura {

    public int recibirAtaque(int danio) {
        return (int) Math.ceil(danio * 0.425);  // Reducción promedio del 57.5%
    }
    
}
