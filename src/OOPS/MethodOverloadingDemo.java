package OOPS;

public class MethodOverloadingDemo {

	/*
	 * Method Overloading:
	 * 1. By diff number of parameters
	 * 2. By diff data type
	 * 
	 * 3. By changing the return type: Not possible
	 * 
	 * 
	 */
	public void sum(int a, int b) {
		System.out.println("Adding 2 int numbers");
	}
	
	public void sum(int a, int b, int c) {
		System.out.println("Adding 3 int numbers");
	}
	
	public void sum(float a, float b) {
		System.out.println("Adding 2 float numbers");
	}
	
//	public int returnName() {
//		String name = "Ajay";
//		return 4;
//	}
//	
//	
//	public String returnName() {
//		String name = "Ajay";
//		return name;
//	}
	
	
	
	
	
}
