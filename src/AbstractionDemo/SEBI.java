package AbstractionDemo;

public abstract class SEBI {

	public void m1() {
		System.out.println("Method 1");
	}
	
	public abstract void m2();
	
	public final void cannotoverride() {
		
	}
}
