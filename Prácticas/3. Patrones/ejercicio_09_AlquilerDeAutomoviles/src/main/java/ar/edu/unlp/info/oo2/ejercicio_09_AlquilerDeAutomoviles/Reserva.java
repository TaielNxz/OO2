package ar.edu.unlp.info.oo2.ejercicio_09_AlquilerDeAutomoviles;

import java.time.LocalDate;

public class Reserva {

	private AutoEnAlquiler auto;
	private int cantidadDias;
	private LocalDate fecha;
	
	public Reserva(AutoEnAlquiler auto, int cantidadDias, LocalDate fecha) {
		this.auto = auto;
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
	}

	public AutoEnAlquiler getAuto() {
		return auto;
	}

	public void setAuto(AutoEnAlquiler auto) {
		this.auto = auto;
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

	double montoAPagar() {
        return this.cantidadDias * auto.getPrecioPorDia();
    }

    double montoAReembolsar(LocalDate fechaCancelacion) {
        return auto.getPoliticaCancelacion().calcularReembolso(this, fechaCancelacion);
    }

}
