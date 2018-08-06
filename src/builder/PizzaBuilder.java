package builder;

public class PizzaBuilder {
	
		private Pizza pizza;
		
		public PizzaBuilder(String base) {
			pizza=new Pizza();
			pizza.setBase(base);
		}
		
		public PizzaBuilder withCheese(String cheese) {
			pizza.setCheese(cheese);
			return this;
		}
		
		public PizzaBuilder withSause(String sause) {
			pizza.setSause(sause);
			return this;
		}
		
		public PizzaBuilder withMushroom(String mushroom) {
			pizza.setMushroom(mushroom);
			return this;
		}
		
		public PizzaBuilder withChicken(String chicken) {
			pizza.setChicken(chicken);
			return this;
		}
		
		public Pizza build() {
			return pizza;
		}
}
