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
	 * Getters y Setters
	*/
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getAderezo() {
		return aderezo;
	}

	public void setAderezo(String aderezo) {
		this.aderezo = aderezo;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public String getAdicional() {
		return adicional;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public double getPrecioPan() {
		return precioPan;
	}

	public void setPrecioPan(double precioPan) {
		this.precioPan = precioPan;
	}

	public double getPrecioAderezo() {
		return precioAderezo;
	}

	public void setPrecioAderezo(double precioAderezo) {
		this.precioAderezo = precioAderezo;
	}

	public double getPrecioPrincipal() {
		return precioPrincipal;
	}

	public void setPrecioPrincipal(double precioPrincipal) {
		this.precioPrincipal = precioPrincipal;
	}

	public double getPrecioAdicional() {
		return precioAdicional;
	}

	public void setPrecioAdicional(double precioAdicional) {
		this.precioAdicional = precioAdicional;
	}
	
}
