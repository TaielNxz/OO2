package ar.edu.unlp.info.oo2.ejercicio_19_PersonajesDejuegosDeRol;

public class ArmaEspada extends Arma {

    @Override
    public int golpear(Armadura armadura) {
        return armadura.recibirAtaque(8);
    }
}
