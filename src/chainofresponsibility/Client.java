package chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		IHandler addHandler=new AddHandler();
		IHandler subHandler=new SubstractHandler();
		IHandler multiplyHandler=new MultiplyHandler();
		addHandler.setNextHandler(subHandler);
		subHandler.setNextHandler(multiplyHandler);
		
		System.out.println(addHandler.calculate(5, 2, '+'));
		System.out.println(addHandler.calculate(5, 2, '-'));
		System.out.println(addHandler.calculate(5, 2, '*'));
	}
}
