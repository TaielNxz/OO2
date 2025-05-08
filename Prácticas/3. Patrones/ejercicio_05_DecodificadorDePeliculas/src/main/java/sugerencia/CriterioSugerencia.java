package sugerencia;

import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas.Decodificador;
import ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas.Pelicula;

public abstract class CriterioSugerencia {
	
	public List<Pelicula> obtenerSugerencias( Decodificador decodificador ) {
		return this.sugerirPeliculas(decodificador).stream()
				.filter( p -> !decodificador.getReproducidas().contains(p) )
				.limit(3)
				.collect(Collectors.toList());
	}
	
	public abstract List<Pelicula> sugerirPeliculas( Decodificador decodificador );
	
}
