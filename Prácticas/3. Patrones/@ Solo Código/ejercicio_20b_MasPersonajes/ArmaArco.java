package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes;

public class ArmaArco extends Arma {

    public int golpear(Armadura armadura) {
        return armadura.recibirAtaque(5);
    }

}
