package ar.edu.unlp.info.oo2.ejercicio_15_FileManager;

public class AspectFechaCreacion extends Aspect {

	public AspectFechaCreacion(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "fecha de creacion: " + this.getFechaCreacion() + "\n";
	}

}
