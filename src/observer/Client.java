package observer;

public class Client {
	public static void main(String[] args) {
		Inventory inventory=new Inventory();
		User johnDoe=new User("John Doe");
		User janeDoe=new User("Jane Doe");
		inventory.attach(johnDoe);
		inventory.attach(janeDoe);
		inventory.addProduct(new Product("Milk","Milk Desc"));
		inventory.addProduct(new Product("Bread","Bread Desc"));
	}
}
