package abstractfactory;

public class CarFactory extends VehicleFactory{
	@Override
	public IVehicle create(VehicleType vehicleType) {
		if (vehicleType.equals(VehicleType.SEDAN))
			return new Sedan();
		else if (vehicleType.equals(VehicleType.SUV))
			return new Suv();
		else
			return null;
	}
}
