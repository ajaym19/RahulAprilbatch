package AbstractionDemo;

public interface RBI {

	/*
	 * Interfaces
	 * 1. It can only contain idea
	 * 2. Method signature
	 * 3. If any class is implementing an Interface, 
	 * then it should compulsory implement all the methods of the interface
	 * 
	 * Abstract Method:
	 * A method without a body is called as AM
	 * 
	 * webdriver >> Interface
	 * Chrome browser
	 * 
	 * Multiple classes can implement the same interface
	 * 
	 */
	
	public void depositMoney();
	
	public abstract void withdrawMoney();
	
	public void giveInterest();
	
	public void abc();
	
}
