package ar.edu.unlp.info.oo2.ejercicio_05_DecodificadorDePeliculas;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String titulo;
	private Year anio;	
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula( String titulo, Year anio, double puntaje ) {
		this.titulo = titulo;
		this.anio = anio;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}

	public void agregarSimilar( Pelicula pelicula ) {

		if ( !this.similares.contains(pelicula) ) {
			this.similares.add(pelicula);
			pelicula.agregarSimilar(this);
		}

	}

	public String toString() {
		return    "Titulo: " + titulo 
				+ "\nAnio: " + anio 
				+ "\nPuntaje: " + puntaje;
	}
	
	/*
	 * Getters y Setters
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Year getAnio() {
		return anio;
	}

	public void setAnio(Year anio) {
		this.anio = anio;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

	public void setSimilares(List<Pelicula> similares) {
		this.similares = similares;
	}

}
