package abstractfactory;

public class BoxTruck implements ITruck {

	@Override
	public void start() {
		System.out.println("Box Truck starting");
	}

}
