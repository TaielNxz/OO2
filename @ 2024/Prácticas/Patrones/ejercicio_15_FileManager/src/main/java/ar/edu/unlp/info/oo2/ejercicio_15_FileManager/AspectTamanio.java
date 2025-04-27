package ar.edu.unlp.info.oo2.ejercicio_15_FileManager;

public class AspectTamanio extends Aspect {

	public AspectTamanio(FileOO2 file) {
		super(file);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + "tamanio: " + this.getTamanio() + "\n";
	}

}
