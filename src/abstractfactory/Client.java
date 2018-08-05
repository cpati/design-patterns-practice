package abstractfactory;

public class Client {
	public static void main(String[] args) {
		VehicleFactory carFactory=new CarFactory();
		VehicleFactory truckFactory=new TruckFactory();
		IVehicle sedan=carFactory.create(VehicleType.SEDAN);
		IVehicle suv=carFactory.create(VehicleType.SUV);
		IVehicle boxTruck=truckFactory.create(VehicleType.BOX_TRUCK);
		IVehicle tractor=truckFactory.create(VehicleType.TRACTOR);
		sedan.start();
		suv.start();
		boxTruck.start();
		tractor.start();
	}
}
