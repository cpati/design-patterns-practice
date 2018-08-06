package observer;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements ISubject{
	
	private List<IObserver> observers;
	private List<Product> products;
	private Product latestProduct;
	
	public Inventory() {
		observers=new ArrayList<>();
		products=new ArrayList<>();
	}
	
	@Override
	public void attach(IObserver observer) {
		observers.add(observer);
		
	}
	
	@Override
	public void detach(IObserver observer) {
		observers.remove(observer);
		
	}
	
	@Override
	public void notifyObservers() {
		for (IObserver iObserver : observers) {
			iObserver.update(latestProduct);
		}
	}
	
	public void addProduct(Product product) {
		products.add(product);
		latestProduct=product;
		notifyObservers();
	}
}
