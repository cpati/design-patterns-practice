package abstractfactory;

public class Tractor implements ITruck {

	@Override
	public void start() {
		System.out.println("Tractor starting");
	}

}
