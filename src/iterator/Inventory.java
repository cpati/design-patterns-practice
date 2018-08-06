package iterator;

public class Inventory implements ProductIterator,ProductCollection{

	private Product[] products;
	private int currentIdx=0;
	
	public Inventory(){
		products=new Product[10];
		products[0]=new Product("Milk");
		products[1]=new Product("Bread");
		products[2]=new Product("Egg");
	}
	
	@Override
	public boolean hasNext() {
		if (currentIdx < size()) 
			return true;
		return false;
	}

	@Override
	public Product next() {		
		Product product=products[currentIdx];
		currentIdx++;
		return product;
	}

	@Override
	public int size() {
		int count=0;
		for (int i=0;i<products.length;i++) {
			if(products[i] !=null)
				count++;
		}
		return count;
	}

	@Override
	public ProductIterator iterator() {
		return this;
	}
	
}
