package observer;

public class User implements IObserver{
	private String name;
	
	public User(String name) {
		this.name=name;
	}

	@Override
	public void update(Product product) {
		System.out.println("I "+name+" got notified for product "+product.getName());
	}
}
