package strategy;

public interface IOrder {
	public void placeOrder();
	public void setPaymentType(IPayment paymentType);
}
