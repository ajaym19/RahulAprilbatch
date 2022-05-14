package CollectionsDemo;

public class ArrayDemo {

	/*
	 * Array:
	 * used to store multiple values in one variable
	 * it is compulsory to declare the size of an array
	 * 3 parts:
	 * 1. Declaration
	 * 2. Instantiation
	 * 3. Initialisation
	 * 
	 * By default all the values are initi to 0 or null based on the data type
	 * 
	 */
	
	public static void main(String[] args) {
		int sid = 4; //100 students 
		//System.out.println(sid);
		int sid1 = 5;
		
		int id[]; //Declartion
		id = new int[5]; //Instantiation
		
		//id	[4 _ 2 7 _]
		//	     0 1 2 3 4
		id[0] = 4;
		System.out.println(id[0]);
		System.out.println(id[1]);
		//System.out.println(id[8]);
		System.out.println("Length of the array is " + id.length);
		int length = id.length;
		System.out.println(id[length-1]);
		
		//ArrayDemo obj = new ArrayDemo();
		//int id1[] = new int[];
		
		//for loop to print all the elements of the array
		for(int i =0; i < id.length; i++) {
			System.out.println(id[i]);
		}
		
		
		
		
		
	}
}
