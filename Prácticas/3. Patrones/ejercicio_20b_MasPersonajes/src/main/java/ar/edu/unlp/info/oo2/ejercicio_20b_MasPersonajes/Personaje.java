package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes;

import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armaduras.Armadura;
import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armas.Arma;
import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.habilidades.Habilidad;

public class Personaje {
	
    private int vida;
    private Arma arma;
    private Armadura armadura;
    private List<Habilidad> habilidades;

    public Personaje( Arma arma , Armadura armadura , List<Habilidad> habilidades ) {
        this.vida = 100;
        this.arma = arma;
        this.armadura = armadura;
        this.habilidades = habilidades;
    }

    public void atacar(Personaje enemigo) {
        int danio = arma.golpear(enemigo.armadura);
        enemigo.recibirAtaque(danio);
    }

    public void recibirAtaque(int danio) {
        this.vida -= danio;
    }

    public int getVida() {
        return vida;
    }
    
}
