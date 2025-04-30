package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import java.time.LocalDate;

public class Reserva {

	private AutoEnAlquiler auto;
	private Usuario usuario;
	private int cantidadDias;
	private LocalDate fecha;
	
	public Reserva(AutoEnAlquiler auto, Usuario usuario, int cantidadDias, LocalDate fecha) {
		this.auto = auto;
		this.usuario = usuario;
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
	}

	public AutoEnAlquiler getAuto() {
		return auto;
	}

	public void setAuto(AutoEnAlquiler auto) {
		this.auto = auto;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
    public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double montoAPagar() {
        return this.cantidadDias * auto.getPrecioPorDia();
    }

	public double montoAReembolsar(LocalDate fechaCancelacion) {
        return auto.getPoliticaCancelacion().calcularReembolso(this, fechaCancelacion);
    }

}
