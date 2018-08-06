package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IEmployee{
	private List<IEmployee> reports;
	private String name;
	
	public Manager(String name) {
		reports=new ArrayList<>();
		this.name=name;
	}
	
	public void assignReports(IEmployee emp) {
		reports.add(emp);
	}
	
	@Override
	public int directReports() {
		int count=0;
		for (IEmployee iEmployee : reports) {
			if (iEmployee instanceof Employee)
				count=count+1;
			else 
				count=count+iEmployee.directReports();
		}
		return count;
	}
	
}
