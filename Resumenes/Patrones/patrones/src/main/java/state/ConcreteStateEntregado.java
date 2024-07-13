package state;

public class ConcreteStateEntregado extends State {

	public ConcreteStateEntregado(Context pedido) {
		super(pedido);
	}

	@Override
	// el pedido ya fue entregado, no puede estar cocinandose...
	public boolean isCocinando() {
		return false;
	}

}
