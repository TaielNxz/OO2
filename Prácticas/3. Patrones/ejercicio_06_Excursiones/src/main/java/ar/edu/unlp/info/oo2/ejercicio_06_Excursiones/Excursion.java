package ar.edu.unlp.info.oo2.ejercicio_06_Excursiones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.estado.Estado;
import ar.edu.unlp.info.oo2.ejercicio_06_Excursiones.estado.Provisoria;

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
		return this.estado.obtenerInformacion();
	}
	
	public String obtenerInformacionBasica() {
		return    "Nombre de la excursion: " + nombre + "\n"
				+ "Costo: " + costo + "\n"
				+ "Fecha de inicio: " + fechaInicio + "\n"
				+ "Fecha de fin: " + fechaFin + "\n"
				+ "Punto de encuentro: " + puntoEncuentro + "\n";
	}

	
	/*
	 * Getters y Setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getPuntoEncuentro() {
		return puntoEncuentro;
	}

	public void setPuntoEncuentro(String puntoEncuentro) {
		this.puntoEncuentro = puntoEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public int getCupoMinimo() {
		return cupoMinimo;
	}

	public void setCupoMinimo(int cupoMinimo) {
		this.cupoMinimo = cupoMinimo;
	}

	public int getCupoMaximo() {
		return cupoMaximo;
	}

	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(List<Usuario> inscriptos) {
		this.inscriptos = inscriptos;
	}

	public List<Usuario> getEnEspera() {
		return enEspera;
	}

	public void setEnEspera(List<Usuario> enEspera) {
		this.enEspera = enEspera;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
