package basics;

public class ConstructorDemo {

	/*
	 * Constructor:
	 * 
	 * whenever you create an object constructor of the class is called used to
	 * assign some value 2 types: 1. Parameterless 2. Parametrized
	 * 
	 */

	int id;
	String name;

	public ConstructorDemo() {
		System.out.println("I am in non parametrized Constructor");
	}

	public ConstructorDemo(int id) {
		System.out.println("I am in single parametrized Constructor");
		this.id = id;

	}

	public ConstructorDemo(int id, String name) {
		System.out.println("I am in single parametrized Constructor");
		this.id = id;
		this.name = name;
	}

}
