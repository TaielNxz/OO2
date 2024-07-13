package decorator;

public class ConcreteDecoratorArmadura extends Decorator {

	public ConcreteDecoratorArmadura(Component componentADecorar) {
		super(componentADecorar);
	}

    @Override
    public String mostrarEquipamiento() {
        return super.mostrarEquipamiento() + "Tiene Armadura\n";
    }
	
}
