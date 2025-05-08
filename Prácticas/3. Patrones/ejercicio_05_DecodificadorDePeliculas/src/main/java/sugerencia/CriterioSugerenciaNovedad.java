package sugerencia;

import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas.Decodificador;
import ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas.Pelicula;

public class CriterioSugerenciaNovedad extends CriterioSugerencia {

	@Override
	public List<Pelicula> sugerirPeliculas( Decodificador decodificador ) {
		return decodificador.getPeliculas().stream()
				.sorted((p1, p2) -> p2.getAnio().compareTo(p1.getAnio()))
				.collect(Collectors.toList());
	}

}
