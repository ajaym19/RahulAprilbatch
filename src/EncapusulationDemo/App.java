package EncapusulationDemo;

public class App {

	public static void main(String[] args) {
		Students s1 = new Students();
		//System.out.println(s1.name); //null
		
		System.out.println(s1.getName());
		s1.setName("Nonsense");
		System.out.println(s1.getName());
		System.out.println(s1.getRollNo());
		
		
	}
}
