package ar.edu.unlp.info.oo2.ejercicio_15_FileManager;

import java.time.LocalDate;

public class File implements FileOO2 {

	private String nombre;
	private String extension;
	private double tamanio;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private String permisos;
	
	
	public File( String nombre , String extension , double tamanio , LocalDate fechaCreacion , LocalDate fechaModificacion , String permisos ) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}

	@Override
	public String prettyPrint() {
		return "========= File data =========\n";
	}
	
	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String getExtension() {
		return extension;
	}

	@Override
	public String getTamanio() {
		return Double.toString(this.tamanio);
	}

	@Override
	public String getFechaCreacion() {
		return this.fechaCreacion.toString();
	}

	@Override
	public String getFechaModificacion() {
		return this.fechaModificacion.toString();
	}

	@Override
	public String getPermisos() {
		return permisos;
	}
	
	
}
