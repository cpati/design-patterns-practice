package abstractfactory;

public class Sedan implements ICar {

	@Override
	public void start() {
		System.out.println("Sedan starting");
	}

}
