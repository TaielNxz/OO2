package ar.edu.unlp.info.oo2.ejercicio_09_Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private List<Usuario> inscriptos;
	private List<Usuario> enEspera;
	private Estado estado;
	
	
	public Excursion( String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
		int cupoMinimo, int cupoMaximo ) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.inscriptos = new ArrayList<Usuario>();
		this.enEspera = new ArrayList<Usuario>();
		this.estado = new Provisoria(this);
	}
	

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public List<Usuario> getEnEspera() {
		return enEspera;
	}

	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado( Estado estado ) {
		this.estado = estado;
	}

	
	public void inscribirUsuario( Usuario usuario ) {
		this.estado.inscribir(usuario);
	}
	
	
	public boolean alcanzoCupoMinimo() {
		return this.inscriptos.size() >= this.cupoMinimo;
	}
	
	
	public boolean alcanzoCupoMaximo() {
		return this.inscriptos.size() >= this.cupoMaximo;
	}
	
	
	public int faltantesParaCupoMinimo() {	
		return ( this.alcanzoCupoMinimo() ) ? 0
									        : this.cupoMinimo - this.inscriptos.size();
	}
	
	
	public int faltantesParaCupoMaximo() {
		return ( this.alcanzoCupoMaximo() ) ? 0
											: this.cupoMaximo - this.inscriptos.size();
	}
	
	
	public String mailsDeInscriptos() {
		return this.inscriptos.stream()
				.map( u -> u.getEmail() )
				.collect(Collectors.joining("\n"));
	}
	
	public String obtenerInformacion() {
		return    "Nombre de la excursion: " + this.nombre + "\n"
				+ "Costo: "                  + this.costo  + "\n"
				+ "Fecha de inicio: "        + this.fechaInicio.toString() + "\n"
				+ "Fecha de fin: "           + this.fechaFin.toString() + "\n"
				+ "Punto de encuentro: "     + this.puntoEncuentro + "\n"
				+ this.estado.obtenerInformacion();
	}
	
}
