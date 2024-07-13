package decorator;

public class ConcreteDecoratorCasco extends Decorator {

	public ConcreteDecoratorCasco(Component componentADecorar) {
		super(componentADecorar);
	}

    @Override
    public String mostrarEquipamiento() {
        return super.mostrarEquipamiento() + "Tiene Casco\n";
    }
	
}
