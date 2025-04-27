package ar.edu.unlp.info.oo2.ejercicio_15_FileManager;

public class AspectPermisos extends Aspect {

	public AspectPermisos(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "permisos: " + this.getPermisos() + "\n";
	}

}
