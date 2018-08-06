package decorator;

public class SixCylinderDecorator extends ToyotaDecorator{

	public SixCylinderDecorator(ICar car) {
		super(car);
	}
	
	@Override
	public String getDescription() {
		return car.getDescription()+" Six Cylinder";
	}

	@Override
	public double getPrice() {
		return car.getPrice()+2000.00;
	}
}
