package ar.edu.unlp.info.oo2.ejercicio_15_FileManager;

public class AspectFechaModificacion extends Aspect {

	public AspectFechaModificacion(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "fecha de modificacion: " + this.getFechaModificacion() + "\n";
	}

}
