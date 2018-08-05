package strategy;

public class MasterCardPayment implements IPayment{
	@Override
	public void payment() {
		System.out.println("Master card payment made!!");
	}
}
