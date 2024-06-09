package ar.edu.unlp.info.oo2.ejercicio_15_FileManager;


public class Aspect implements FileOO2 {

	private FileOO2 component;

	public Aspect(FileOO2 component) {
		this.component = component;
	}

	@Override
	public String prettyPrint() {
		return this.component.prettyPrint();
	}

	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public String getTamanio() {
		return this.component.getTamanio();
	}

	@Override
	public String getFechaCreacion() {
		return this.component.getFechaCreacion();
	}

	@Override
	public String getFechaModificacion() {
		return this.component.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.component.getPermisos();
	}

}