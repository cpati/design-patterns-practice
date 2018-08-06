package composite;

public class Client {
	public static void main(String[] args) {
		IEmployee emp1=new Employee("emp1");
		IEmployee emp2=new Employee("emp2");
		IEmployee emp3=new Employee("emp3");
		IEmployee emp4=new Employee("emp4");
		
		IEmployee mgr1=new Manager("mgr1");
		IEmployee mgr2=new Manager("mgr2");
		
		((Manager)mgr1).assignReports(emp1);
		((Manager)mgr1).assignReports(emp2);
		
		((Manager)mgr2).assignReports(mgr1);
		((Manager)mgr2).assignReports(emp3);
		((Manager)mgr2).assignReports(emp4);
		
		System.out.println(emp1.directReports());
		System.out.println(mgr1.directReports());
		System.out.println(mgr2.directReports());
	}

}
