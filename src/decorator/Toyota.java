package decorator;

public class Toyota implements ICar{

	@Override
	public String getDescription() {
		return "Toyota";
		
	}

	@Override
	public double getPrice() {
		return 20000.00;
	}

}
