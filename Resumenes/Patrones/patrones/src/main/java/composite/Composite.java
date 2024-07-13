package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	List<Component> caras;
	
	public Composite( Component cara1 , Component cara2 , Component cara3 , Component cara4 , Component cara5 , Component cara6 ) {
		this.caras = new ArrayList<Component>();
		caras.add(cara1);
		caras.add(cara2);
		caras.add(cara3);
		caras.add(cara4);
		caras.add(cara5);
		caras.add(cara6);
	}

	public int getCantidadDeCaras() {
		return this.caras.stream()
				.mapToInt( cara -> cara.getCantidadDeCaras() )
				.sum();
	}
	
}
