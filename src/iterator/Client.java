package iterator;

public class Client {
	public static void main(String[] args) {
		ProductIterator iterator=new Inventory().iterator();
		System.out.println(iterator.size());
		while(iterator.hasNext()) {
			System.out.println(((Product)iterator.next()).getName());
		}
	}
}
