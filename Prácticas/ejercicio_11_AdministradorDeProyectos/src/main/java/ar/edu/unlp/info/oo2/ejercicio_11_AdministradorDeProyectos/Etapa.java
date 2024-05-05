package ar.edu.unlp.info.oo2.ejercicio_11_AdministradorDeProyectos;

public abstract class Etapa {

	private Proyecto proyecto;
	
	public Etapa(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	

	public Proyecto getProyecto() {
		return proyecto;
	}
	
	
	public abstract void aprobarEtapa();
	
	
	public abstract boolean modificarMargenGanancias(double margen);
	
}
