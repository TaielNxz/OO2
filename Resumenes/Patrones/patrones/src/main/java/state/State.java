package state;

public abstract class State {

	Context pedido;

	public State( Context pedido ) {
		this.pedido = pedido;
	}

	public Context getPedido() {
		return pedido;
	}
	
	public abstract boolean isCocinando();
	
}
