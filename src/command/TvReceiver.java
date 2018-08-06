package command;

public class TvReceiver implements IReceiver{

	@Override
	public void on() {
		System.out.println("TV On");
		
	}

	@Override
	public void off() {
		System.out.println("TV off");
	}
	
}
