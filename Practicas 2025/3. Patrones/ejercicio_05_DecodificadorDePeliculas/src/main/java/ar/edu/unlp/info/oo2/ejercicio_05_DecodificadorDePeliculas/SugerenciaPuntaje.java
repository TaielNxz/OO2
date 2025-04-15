package ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugerenciaPuntaje extends Sugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas( Decodificador decodificador ) {
		
	    // Ordenar por puntaje (descendente) y año (en caso de empatar)
		return decodificador.getPeliculas().stream()
	            .sorted(
					Comparator.comparingDouble(Pelicula::getPuntaje).reversed()
					.thenComparing(Comparator.comparing(Pelicula::getAnio).reversed())
	            )
				.collect(Collectors.toList());		
	}

}
