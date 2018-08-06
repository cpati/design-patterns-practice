package decorator;

public class NavigationDecorator extends ToyotaDecorator{

	public NavigationDecorator(ICar car) {
		super(car);
	}
	
	@Override
	public String getDescription() {
		return car.getDescription()+" Navigation";
	}

	@Override
	public double getPrice() {
		return car.getPrice()+1000.00;
	}
}
