package ar.edu.unlp.info.oo2.ejercicio_19b_MasPersonajes;

import java.util.ArrayList;
import java.util.List;

public class FactoryPersonajeArquero extends FactoryPersonaje {

	@Override
	public Personaje crearPersonaje() {	
		List<Habilidad> habilidades = new ArrayList<Habilidad>();
		habilidades.add( new HabilidadDistancia() );
		return new Personaje( new ArmaArco() , new ArmaduraDeCuero() , habilidades ) ;
	}

}