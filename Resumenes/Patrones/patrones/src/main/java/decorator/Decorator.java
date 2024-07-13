package decorator;

public abstract class Decorator implements Component {

	private Component component;
	
	
	public Decorator(Component componentADecorar) {
		this.component = componentADecorar;
	}

	public String mostrarEquipamiento() {
		return this.component.mostrarEquipamiento();
	}
	
	
}
