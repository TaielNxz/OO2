package state;

public class ConcreteStatePreparando extends State {

	public ConcreteStatePreparando(Context pedido) {
		super(pedido);
	}

	@Override
	// el pedido se esta cocinando...
	public boolean isCocinando() {
		return true;
	}
	
}
