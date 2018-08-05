package chainofresponsibility;

public interface IHandler {
	public void setNextHandler(IHandler nextHandler);
	public int calculate(int num1,int num2,char operator);
}
