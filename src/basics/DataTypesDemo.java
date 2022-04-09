package basics;

public class DataTypesDemo {

	public static void main(String[] args) {
		
		/*
		 * Data Type:
		 * variable is something which might keep on changing
		 * in JAVA, variables are used to store data
		 * It is compulsory to define the data type of a variable
		 * 
		 * Data Types:
		 * 1. Primitive:
		 * 		Integer: byte, short, int, long
		 * 		Decimal: float, double
		 * 		Single character: char
		 * 		true/false: boolean
		 *  
		 * 2. Non Primitive: String, Array, List
		 * 
		 */
		
		String name = "Ajay";
		System.out.println(name);
		
		
		byte a = -126; //-128 to 127
		System.out.println(a);
		
		int b = 51065;
		System.out.println(b);
		
		//Floating
		//any value with decimal is considered as double by default
		float f1 = 34.543453f;
		double d1 = 43.21d;
		System.out.println(f1);
		System.out.println(d1);
		
		//char
		//used to store single character
		//use single quotes for character
		char c1 = 'd';
		char c2 = '$';
		char c3 = '3';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = 'a';
		
		//sequence of characters is called as String
		
		String c5 = "ajay";
		
		
		
		//boolean
		
		//boolean bb1 = True;  
		//boolean bb2 = False;
		boolean bb3 = true;
		boolean bb4 = false;
		//boolean bb5 = 1;
		//boolean bb6 = 0;
		System.out.println(bb3);
	
	}
}
