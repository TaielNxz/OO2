package decorator;

public class ConcreteDecoratorGuantes extends Decorator {

	public ConcreteDecoratorGuantes(Component componentADecorar) {
		super(componentADecorar);
	}

    @Override
    public String mostrarEquipamiento() {
        return super.mostrarEquipamiento() + "Tiene Guantes\n";
    }
	
}
