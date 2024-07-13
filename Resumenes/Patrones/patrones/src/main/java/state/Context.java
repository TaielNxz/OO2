package state;

public class Context {

	private State estado;

	public Context( State estado ) {
		this.estado = estado;
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}
	
}
