package decorator;

public abstract class ToyotaDecorator implements ICar{
	
	protected ICar car;
	
	public ToyotaDecorator(ICar car) {
		this.car=car;
	}
	
	@Override
	public String getDescription() {
		return car.getDescription();
	}
	
	@Override
	public double getPrice() {
		return car.getPrice();
	}
}
