package sugerencia;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas.Decodificador;
import ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas.Pelicula;

public class CriterioSugerenciaPuntaje extends CriterioSugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas( Decodificador decodificador ) {
		return decodificador.getPeliculas().stream()
	            .sorted(
					Comparator.comparingDouble(Pelicula::getPuntaje).reversed()          // Ordenar por puntaje (descendente)
					.thenComparing(Comparator.comparing(Pelicula::getAnio).reversed())   // Ordenar por año (en caso de empatar)
	            )
				.collect(Collectors.toList());		
	}

}
