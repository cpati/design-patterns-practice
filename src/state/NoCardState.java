package state;

public class NoCardState implements ATMState{
	
	private ATMMachine aTMMachine;
	
	public NoCardState(ATMMachine aTMMachine) {
		this.aTMMachine=aTMMachine;
	}
	
	@Override
	public void insertCard() {
		aTMMachine.setHasCardState();
	}

	@Override
	public void ejectCard() {
		System.out.println("No card present!!");
		
	}

	@Override
	public void withDrawCash() {
		System.out.println("No card present!!");
	}

}
