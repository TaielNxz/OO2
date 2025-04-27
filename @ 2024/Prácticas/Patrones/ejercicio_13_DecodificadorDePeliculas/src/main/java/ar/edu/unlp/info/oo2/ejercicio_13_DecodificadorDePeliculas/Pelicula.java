package ar.edu.unlp.info.oo2.ejercicio_13_DecodificadorDePeliculas;

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
	
	
	public String getTitulo() {
		return this.titulo;
	}
	
	
	public Year getAnio() {
		return this.anio;
	}
	
	
	public double getPuntaje() {
		return this.puntaje;
	}
	
	
	public List<Pelicula> getSimilares() {
		return this.similares;
	}
	
	
	public void agregarSimilar( Pelicula pelicula ) {
		
		if ( !this.similares.contains(pelicula) ) {
			this.similares.add(pelicula);
			pelicula.agregarSimilar(this);
		}
		
	}


	@Override
	public String toString() {
		return    "Titulo: " + titulo 
				+ "\nAnio: " + anio 
				+ "\nPuntaje: " + puntaje;
	}


	
}
