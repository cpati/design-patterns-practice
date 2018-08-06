package strategy;

public class Order implements IOrder{

	private IPayment paymentType;
	
	public Order() {
		
	}
	
	@Override
	public void placeOrder() {
		System.out.println("Order Created!!");
		//Payment could be visa/mastercard
		paymentType.payment();
	}
	
	public void setPaymentType(IPayment paymentType) {
		this.paymentType=paymentType;
	}
	
}
