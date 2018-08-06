package command;

public class TurnTvOffCommand implements ICommand{

	private IReceiver receiver;
	
	public TurnTvOffCommand(IReceiver receiver) {
		this.receiver=receiver;
	}
	
	@Override
	public void execute() {
		receiver.off();
	}

}
