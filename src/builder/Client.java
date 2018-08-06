package builder;

public class Client {
	public static void main(String[] args) {
		Pizza pizza=new PizzaBuilder("thin crust").build();
		System.out.println(pizza);
		pizza=new PizzaBuilder("thin crust").withCheese("mozzarella").withChicken("pepper chicken").build();
		System.out.println(pizza);
	}
}
