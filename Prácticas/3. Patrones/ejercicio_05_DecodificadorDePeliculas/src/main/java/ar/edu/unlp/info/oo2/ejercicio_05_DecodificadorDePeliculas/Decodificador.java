package ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import sugerencia.CriterioSugerencia;
import sugerencia.CriterioSugerenciaNovedad;

public class Decodificador {

	private CriterioSugerencia criterioSugerencia;
	private List<Pelicula> peliculas;
	private List<Pelicula> reproducidas;
	
	
	public Decodificador() {
		this.criterioSugerencia = new CriterioSugerenciaNovedad();
		this.peliculas = new ArrayList<Pelicula>();
		this.reproducidas = new ArrayList<Pelicula>();
		
	}
	
	public void agregarPelicula(Pelicula pelicula) {
		this.peliculas.add(pelicula);
	}

	
	public void agregarReproducida(Pelicula pelicula) {
		this.reproducidas.add(pelicula);
	}
	
	
	public List<Pelicula> obtenerSugerencias() {
		return this.criterioSugerencia.obtenerSugerencias(this);
		
	}
	
	
	public boolean fueReproducida(Pelicula pelicula) {
		return this.reproducidas.contains(pelicula);
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
	
	
	/*
	 * Getters y Setters
	 */
	public CriterioSugerencia getCriterioSugerencia() {
		return criterioSugerencia;
	}

	public void setCriterioSugerencia(CriterioSugerencia criterioSugerencia) {
		this.criterioSugerencia = criterioSugerencia;
	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public List<Pelicula> getReproducidas() {
		return reproducidas;
	}

	public void setReproducidas(List<Pelicula> reproducidas) {
		this.reproducidas = reproducidas;
	}
	
}
