package ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugerencia {
	
	public List<Pelicula> obtenerSugerencias( Decodificador decodificador ) {
		return this.sugerirPeliculas(decodificador).stream()
				.filter( p -> !decodificador.getReproducidas().contains(p) )
				.limit(3)
				.collect(Collectors.toList());
	}
	
	public abstract List<Pelicula> sugerirPeliculas( Decodificador decodificador );
	
}
