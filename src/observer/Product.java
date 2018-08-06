package observer;

public class Product {
	private String name;
	private String description;
	
	public Product(String name,String description) {
		this.name=name;
		this.description=description;
	}
	
	public String getName() {
		return this.name;
	}
}
