package ar.edu.unlp.info.oo2.ejercicio_11_AdministradorDeProyectos;

public class EnContruccion extends Etapa {

	public EnContruccion(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public void aprobarEtapa() {
		
		Proyecto proyecto = this.getProyecto();
		
		if ( !proyecto.costoNulo() ) {
			proyecto.setEtapa( new EnEvaluacion(proyecto) );	
		} else {
			throw new RuntimeException("El proyecto posee un costo de $0");
		}
		
	}

	@Override
	public boolean modificarMargenGanancias(double margen) {
		return margen >= 0.08 && margen <= 0.1;	
	}
	
}
