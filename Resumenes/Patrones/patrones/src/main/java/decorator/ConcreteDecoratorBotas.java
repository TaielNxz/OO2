package decorator;

public class ConcreteDecoratorBotas extends Decorator {

	public ConcreteDecoratorBotas(Component componentADecorar) {
		super(componentADecorar);
	}

    @Override
    public String mostrarEquipamiento() {
        return super.mostrarEquipamiento() + "Tiene Botas\n";
    }
	
}
