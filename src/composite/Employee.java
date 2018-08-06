package composite;

public class Employee implements IEmployee{
	
	private String name;
	
	public Employee(String name) {
		this.name=name;
	}

	@Override
	public int directReports() {
		return 0;
	}
}
