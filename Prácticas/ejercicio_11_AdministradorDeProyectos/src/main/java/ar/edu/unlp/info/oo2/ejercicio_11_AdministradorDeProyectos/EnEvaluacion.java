package ar.edu.unlp.info.oo2.ejercicio_11_AdministradorDeProyectos;

public class EnEvaluacion extends Etapa {

	public EnEvaluacion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		
		Proyecto proyecto = this.getProyecto();

		proyecto.setEtapa( new Confirmada(proyecto) );	
		
	}

	@Override
	public boolean modificarMargenGanancias(double margen) {
		return margen >= 0.11 && margen <= 0.15;
	}

}
