package ar.edu.unlp.info.oo2.ejercicio_13_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaSimilaridad extends Sugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas( Decodificador decodificador ) {
		
		return decodificador.getPeliculas().stream()
				.map( p -> p.getSimilares() )
				.flatMap( lista -> lista.stream() )
				.distinct()
				.collect(Collectors.toList());
	
	}

}
