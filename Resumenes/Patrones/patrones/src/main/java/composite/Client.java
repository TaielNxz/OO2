package composite;

import java.util.ArrayList;
import java.util.List;

public class Client {

	List<Component> figuras;

	public Client() {
		this.figuras = new ArrayList<Component>();
	}
	
	public void agregarFigura( Component figura ) {
		this.figuras.add(figura);
	}
	
}
