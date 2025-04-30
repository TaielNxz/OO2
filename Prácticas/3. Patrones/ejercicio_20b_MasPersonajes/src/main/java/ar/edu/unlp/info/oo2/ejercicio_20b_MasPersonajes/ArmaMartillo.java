package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes;

public class ArmaMartillo extends Arma {

	@Override
	public int golpear(Armadura armadura) {
		return armadura.recibirAtaque(10);
	}

}
