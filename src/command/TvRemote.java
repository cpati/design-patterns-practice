package command;

public class TvRemote {
	
	private ICommand command;
	
	public TvRemote(ICommand command) {
		this.command=command;
	}
	
	public void press() {
		command.execute();
	}
}
