package chainofresponsibility;

public class SubstractHandler implements IHandler{
	private IHandler nextHandler;
	
	@Override
	public void setNextHandler(IHandler nextHandler) {
		this.nextHandler=nextHandler;
	}
	
	@Override
	public int calculate(int num1, int num2, char operator) {
		if (operator=='-')
			return num1-num2;
		else
			return nextHandler.calculate(num1, num2, operator);
		
	}
}
