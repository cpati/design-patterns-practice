package command;

public class Client {
	public static void main(String[] args) {
		IReceiver receiver=new TvReceiver();
		ICommand tvOn=new TurnTvOnCommand(receiver);
		ICommand tvOff=new TurnTvOffCommand(receiver);
		
		TvRemote tvRemote=new TvRemote(tvOn);
		tvRemote.press();
		
		tvRemote=new TvRemote(tvOff);
		tvRemote.press();
	}
}
