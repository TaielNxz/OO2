package ar.edu.unlp.info.oo2.ejercicio_20_PersonajesDeJuegosDeRol;

import java.util.ArrayList;
import java.util.List;

public class FactoryPersonajeGuerrero extends FactoryPersonaje {

	@Override
	public Personaje crearPersonaje() {	
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add( new HabilidadCuerpoACuerpo() );
		return new Personaje( new ArmaEspada() , new ArmaduraDeAcero() , habilidades ) ;
	}

}
