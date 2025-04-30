package ar.edu.unlp.info.oo2.ejercicio_18_FileManager;

public class AspectNombre extends Aspect {

	public AspectNombre(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "nombre: " + this.getNombre() + "\n";
	}

}
