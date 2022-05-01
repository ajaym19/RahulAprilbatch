package basics;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * String:
		 * it is a non primitive data type
		 * String is a class
		 * It is a final class
		 * 
		 * Strings can be declared in 2 ways
		 * 1. String Literal:
		 * 	a. objects will always be created in SCP 
		 * 	b. before creating an object,
		 * 	it will check if the same value is present in SCP or no
		 * 	if it is present, it will point the variable to the existing object
		 * 	else it will create a new object
		 * 
		 * 2. New Keyword
		 * 
		 * String Objects are immutable
		 * 
		 * 
		 */
		
		String name = "Ajay";
		System.out.println(name);// Ajay
		name = name.concat("Trainer");
		System.out.println(name); //Ajay Trainer
		
		String s1 = new String("Hello");
		System.out.println(s1);
		s1 = s1.concat("World");
		System.out.println(s1);
		
		
		//String Buffer and String Builder
		
		StringBuffer bf = new StringBuffer("Hello");
		System.out.println(bf); //Hello
		bf.append("World");
		System.out.println(bf); //Hello World
		System.out.println(bf.length());
		System.out.println(bf.reverse());
		
		//HW: reverse using or loop
		System.out.println(bf.charAt(2)); 
		System.out.println(bf.equals(name));
		
		//String Builder >> supports Multi Threading
		
	}
}
