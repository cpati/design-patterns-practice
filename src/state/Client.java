package state;

public class Client {
	
	public static void main(String[] args) {
		ATMMachine atmMachine=new ATMMachine();
		atmMachine.ejectCard();
		atmMachine.withDrawCash();
		atmMachine.insertCard();
		atmMachine.withDrawCash();
		atmMachine.ejectCard();
		atmMachine.withDrawCash();
	}
	

}
