package basics;

public class VariableTypes {

	int id; // Global variable
	static int phone;
	

	public static void main(String[] args) {
		int i = 3;// local
		System.out.println(i);
		

	}

	public void showinfo() {
		int id = 4;
		System.out.println(id);
		//I want to print the global variable id?
		System.out.println(this.id);
		
	}

	public void printname() {
		System.out.println(id);
	}

	// u >> have 2 brothers
	// u >> only 1 brother
}
