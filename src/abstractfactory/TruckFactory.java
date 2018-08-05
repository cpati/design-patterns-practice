package abstractfactory;

public class TruckFactory extends VehicleFactory{
	@Override
	public IVehicle create(VehicleType vehicleType) {
		if (vehicleType.equals(VehicleType.BOX_TRUCK))
			return new BoxTruck();
		else if (vehicleType.equals(VehicleType.TRACTOR))
			return new Tractor();
		else
			return null;
	}
}
