package ar.edu.unlp.info.oo2.ejercicio_11_AdministradorDeProyectos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double margenGanancias;
	private int cantIntegrantes;
	private double montoDiarioPorIntegrantes;
	private Etapa etapa;
	
	
	public Proyecto( String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, int cantIntegrantes , double montoDiarioPorIntegrantes ) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margenGanancias = 7;
		this.cantIntegrantes = cantIntegrantes;
		this.montoDiarioPorIntegrantes = montoDiarioPorIntegrantes;
		this.etapa = new EnContruccion(this);
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
	

	public String getObjetivo() {
		return objetivo;
	}
	

	public double getMargenGanancias() {
		return margenGanancias;
	}


	public int getCantIntegrantes() {
		return cantIntegrantes;
	}


	public double getMontoDiarioPorIntegrantes() {
		return montoDiarioPorIntegrantes;
	}

	public Etapa getEtapa() {
		return etapa;
	}
	
	
	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}


	public void aprobarEtapa() {
		this.etapa.aprobarEtapa();
	};


	public double costoDelProyecto() {
	
		// Calcular la cantidad de días entre la fecha de inicio y la fecha de fin
		long diasProyecto = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
		
		// Calcular el costo total del proyecto
		return diasProyecto * ( this.cantIntegrantes * this.montoDiarioPorIntegrantes );
		
	}
	
	
	public boolean costoNulo() {
		return this.costoDelProyecto() == 0;
	}
	
	
	public double precioDelProyecto() {	
		return this.costoDelProyecto() + this.costoDelProyecto() * this.margenGanancias;	
	}
	
	
	public void modificarMargenGanancias(double margen) {
		if ( this.etapa.modificarMargenGanancias(margen) ) {
			this.margenGanancias = margen;
		}
	}
	
	
	public void cancelarProyecto() {
		if ( !this.objetivo.contains("(Cancelado)") ) {
			this.objetivo += " (Cancelado)";
		}
	}
	
}
