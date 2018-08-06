package builder;

public class Pizza {
	private String base;
	private String cheese;
	private String sause;
	private String mushroom;
	private String chicken;
	
	public void setBase(String base) {
		this.base = base;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setSause(String sause) {
		this.sause = sause;
	}
	public void setMushroom(String mushroom) {
		this.mushroom = mushroom;
	}
	public void setChicken(String chicken) {
		this.chicken = chicken;
	}
	
	@Override
	public String toString() {
		return base+" "+cheese+" "+sause+" "+mushroom+" "+chicken;
	}
	
}
