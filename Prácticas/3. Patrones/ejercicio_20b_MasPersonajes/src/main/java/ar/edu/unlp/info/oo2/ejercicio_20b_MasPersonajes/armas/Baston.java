package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armas;

import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armaduras.Armadura;

public class Baston extends Arma {

    @Override
    public int golpear(Armadura armadura) {
        return armadura.recibirAtaque(2);
    }

}
