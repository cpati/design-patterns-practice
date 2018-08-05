package strategy;

public class VisaPayment implements IPayment{
		@Override
		public void payment() {
			System.out.println("Visa payment made!!");
		}
}
