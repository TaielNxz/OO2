package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.factory;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.Personaje;
import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armaduras.*;
import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.armas.*;
import ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes.habilidades.*;

public class FactoryPersonajeGuerrero extends FactoryPersonaje {

	@Override
	public Personaje crearPersonaje() {	
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add( new CuerpoACuerpo() );
		return new Personaje( new Espada() , new ArmaduraDeAcero() , habilidades ) ;
	}

}
