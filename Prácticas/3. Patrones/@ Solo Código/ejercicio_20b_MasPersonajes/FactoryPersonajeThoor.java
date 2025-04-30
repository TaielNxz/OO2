package ar.edu.unlp.info.oo2.ejercicio_20b_MasPersonajes;

import java.util.ArrayList;
import java.util.List;

public class FactoryPersonajeThoor extends FactoryPersonaje {

	@Override
	public Personaje crearPersonaje() {	
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add( new HabilidadLanzarRayos() );
		habilidades.add( new HabilidadDistancia() );
		return new Personaje( new ArmaMartillo() , new ArmaduraDeHierro() , habilidades ) ;
	}

	
}
