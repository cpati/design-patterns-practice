package state;

public class ATMMachine {
	private ATMState state;
	private ATMState noCardstate;
	private ATMState hasCardstate;
	
	public ATMMachine() {
		noCardstate=new NoCardState(this);
		hasCardstate=new HasCardState(this);
		state=noCardstate;
	}
	
	public void setNoCardState() {
		this.state=noCardstate;
	}
	
	public void setHasCardState() {
		this.state=hasCardstate;
	}
	
	public void insertCard() {
		state.insertCard();
	}
	
	public void ejectCard() {
		state.ejectCard();
	}
	
	public void withDrawCash() {
		state.withDrawCash();
	}
}
