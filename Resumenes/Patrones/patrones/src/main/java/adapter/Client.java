package adapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	List<Adapter> temitas;

	public Client() {
		this.temitas = new ArrayList<Adapter>();
	}
	
	public void reproducirTemitas() {
		this.temitas.forEach( tema -> tema.play() );;
	}
	
	public void agregarTemita( Adapter tema ) {
		this.temitas.add(tema);
	}
	
}
