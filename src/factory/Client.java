package factory;

public class Client {
	public static void main(String[] args) {
		CarFactory carFactory=new CarFactory();
		ICar sedan=carFactory.getCar(CarType.SEDAN);
		ICar suv=carFactory.getCar(CarType.SUV);
		sedan.start();
		suv.start();
	}
}
