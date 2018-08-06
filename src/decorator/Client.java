package decorator;

public class Client {
	public static void main(String[] args) {
		ICar car=new SixCylinderDecorator(new NavigationDecorator(new Toyota()));
		System.out.println(car.getDescription());
		System.out.println(car.getPrice());
	}
}
