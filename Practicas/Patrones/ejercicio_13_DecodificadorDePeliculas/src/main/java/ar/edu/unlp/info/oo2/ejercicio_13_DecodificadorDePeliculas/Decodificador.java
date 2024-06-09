package ar.edu.unlp.info.oo2.ejercicio_13_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {

	private Sugerencia criterioSugerencia;
	private List<Pelicula> peliculas;
	private List<Pelicula> reproducidas;
	
	
	public Decodificador() {
		this.criterioSugerencia = new SugerenciaNovedad();
		this.peliculas = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		
	}

	public Sugerencia getSugerencia() {
		return this.criterioSugerencia;
	}
	
	
	public void setCriterioSugerencia(Sugerencia criterioSugerencia ) {
		this.criterioSugerencia = criterioSugerencia;
	}


	public List<Pelicula> getPeliculas() {
		return this.peliculas;
	}
	

	public List<Pelicula> getReproducidas() {
		return this.reproducidas;
	}
	
	
	public void agregarPelicula( Pelicula pelicula ) {
		this.peliculas.add(pelicula);
	}

	
	public void agregarReproducida( Pelicula pelicula ) {
		this.reproducidas.add(pelicula);
	}

	
	public List<Pelicula> obtenerSugerencias() {
		return this.criterioSugerencia.obtenerSugerencias(this);
		
	}
	
	
	public boolean fueReproducida( Pelicula pelicula ) {
		return this.reproducidas.stream()
						.anyMatch( p -> p.getTitulo().equals(pelicula.getTitulo()) );
	}
	
	
	public String mostrarPeliculas() {
		return this.peliculas.stream()
				.map( p -> p.toString() )
				.collect(Collectors.joining("\n"));
	}
	
	
	public String mostrarReproducidas() {
		return this.reproducidas.stream()
				.map( p -> p.toString() )
				.collect(Collectors.joining("\n"));
	}
	
}
