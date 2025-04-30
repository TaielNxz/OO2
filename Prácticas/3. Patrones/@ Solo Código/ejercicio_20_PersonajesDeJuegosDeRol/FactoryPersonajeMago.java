package ar.edu.unlp.info.oo2.ejercicio_20_PersonajesDeJuegosDeRol;

import java.util.ArrayList;
import java.util.List;

public class FactoryPersonajeMago extends FactoryPersonaje {

	@Override
	public Personaje crearPersonaje() {	
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add( new HabilidadMagia() );
		habilidades.add( new HabilidadDistancia() );
		return new Personaje( new ArmaBaston() , new ArmaduraDeCuero() , habilidades ) ;
	}

	
}
