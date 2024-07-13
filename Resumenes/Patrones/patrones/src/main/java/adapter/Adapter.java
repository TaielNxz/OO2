package adapter;

public class Adapter extends Target {

	private Adaptee adaptee;
	
	public String play() {
		return adaptee.reproduce();
	}
	
}
