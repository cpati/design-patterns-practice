package strategy;

public class OrderClient {
	public static void main(String[] args) {
		 
		 IPayment payment=new VisaPayment();
		 IOrder order=new Order();
		 order.setPaymentType(payment);
		 order.placeOrder();
		 
		 payment=new MasterCardPayment();
		 order=new Order();
		 order.setPaymentType(payment);
		 order.placeOrder();
	}
}
