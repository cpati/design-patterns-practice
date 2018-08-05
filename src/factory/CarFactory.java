package factory;

public class CarFactory {
	public ICar getCar(CarType carType) {
		if (carType.equals(CarType.SEDAN))
			return new Sedan();
		else 
			return new Suv();
	}
}
