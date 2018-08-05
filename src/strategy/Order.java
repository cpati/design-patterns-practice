package strategy;

public class Order implements IOrder{

	private IPayment paymentType;
	
	public Order(IPayment paymentType) {
		this.paymentType=paymentType;
	}
	
	@Override
	public void placeOrder() {
		System.out.println("Order Created!!");
		//Payment could be visa/mastercard
		paymentType.payment();
	}
	
}
