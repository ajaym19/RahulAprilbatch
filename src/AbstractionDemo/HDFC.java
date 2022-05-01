package AbstractionDemo;

public class HDFC extends SEBI implements RBI, BandBody {

	
	final int  id = 5;
	
	public void depositMoney() {
		System.out.println("Depositing Money");
	}

	@Override
	public void withdrawMoney() {
		//Math.PI = 45;
		System.out.println("Withdrawing Money");

	}

	@Override
	public void giveInterest() {
		System.out.println("Rate of Interest is 5%");

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub

	}

	

}
