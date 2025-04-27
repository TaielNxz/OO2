package ar.edu.unlp.info.oo2.ejercicio_11_AdministradorDeProyectos;

public class Confirmada extends Etapa {

	public Confirmada(Proyecto proyecto) {
		super(proyecto);
	}


	public void aprobarEtapa() {}
	

	public boolean modificarMargenGanancias(double margen) {
		return false;	
	}

}
