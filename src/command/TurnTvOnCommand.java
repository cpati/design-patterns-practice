package command;

public class TurnTvOnCommand implements ICommand{

	private IReceiver receiver;
	
	public TurnTvOnCommand(IReceiver receiver) {
		this.receiver=receiver;
	}
	
	@Override
	public void execute() {
		receiver.on();
	}

}
