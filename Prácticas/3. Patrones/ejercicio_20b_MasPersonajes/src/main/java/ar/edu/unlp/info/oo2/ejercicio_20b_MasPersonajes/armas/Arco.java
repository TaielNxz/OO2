package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armas;

import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armaduras.Armadura;

public class Arco extends Arma {

    public int golpear(Armadura armadura) {
        return armadura.recibirAtaque(5);
    }

}
