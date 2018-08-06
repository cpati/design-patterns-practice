package state;

public class HasCardState implements ATMState{
	
	private ATMMachine aTMMachine;
	
	public HasCardState(ATMMachine aTMMachine) {
		this.aTMMachine=aTMMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Card already present!!");
	}

	@Override
	public void ejectCard() {
		aTMMachine.setNoCardState();
	}

	@Override
	public void withDrawCash() {
		System.out.println("Cash withdrawn!!");
	}

}
