package ar.edu.unlp.info.oo2.ejercicio_19b_MasPersonajes;

public class ArmaBaston extends Arma {

    @Override
    public int golpear(Armadura armadura) {
        return armadura.recibirAtaque(2);
    }

}
