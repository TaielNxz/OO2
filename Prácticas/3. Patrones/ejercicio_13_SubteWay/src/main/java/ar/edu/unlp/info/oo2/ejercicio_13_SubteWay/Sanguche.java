package ar.edu.unlp.info.oo2.ejercicio_13_SubteWay;

import java.util.List;
import java.util.ArrayList;

public class Sanguche {

	private String pan;
	private String aderezo;
	private String principal;
	private String adicional;
	private double precioPan;
	private double precioAderezo;
	private double precioPrincipal;
	private double precioAdicional;

	public double calcularPrecio() {
		return this.precioPan + this.precioAderezo + this.precioPrincipal + this.precioAdicional;
	}
	
	/*
	 * Setters
	*/
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	public void setAderezo(String adereso) {
		this.aderezo = adereso;
	}
	
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}
	
	public void setPrecioPan(double precioPan) {
		this.precioPan = precioPan;
	}
	
	public void setPrecioAderezo(double precioAderezo) {
		this.precioAderezo = precioAderezo;
	}
	
	public void setPrecioPrincipal(double precioPrincipal) {
		this.precioPrincipal = precioPrincipal;
	}
	
	public void setPrecioAdicional(double precioAdicional) {
		this.precioAdicional = precioAdicional;
	}
	
}
