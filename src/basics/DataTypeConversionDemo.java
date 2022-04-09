package basics;

public class DataTypeConversionDemo {

	public static void main(String[] args) {
		/*
		 * Bucket Theory:
		 * Bucket1 >> 3L
		 * Bucket2 >> 5L
		 * 
		 * Tasks to transfer water:
		 * T1 >> B1 to B2 >> sounds good
		 * T2 >> B2 to B1 >> 
		 * 
		 * byte< short< int < long< float< double 
		 * 
		 */
		
		
		int i1 = 34;
		long l1;
		l1 = i1;
		
		long l2 = 345;
		int i2;
		i2 = (int)l2;
		
		
		float f1 = 34.67f;
		int i3 = (int)f1;
		System.out.println(f1);
		System.out.println(i3);
		
		
		//char to int
		//each character has an ASCII value
		char c1 = 'B';
		int i4 = c1;
		System.out.println(c1); //A
		System.out.println(i4); //
		
		int i5 = 97;
		char c2 = (char)i5;
		System.out.println(i5);
		System.out.println(c2);

		//string to int
		//Every primitive data type has a corresponding wrapper class
		
		String s1 = "123";
		int i7 = Integer.parseInt(s1);
		System.out.println(s1);
		System.out.println(i7);
		
		
		//Integer to string
		int i8 = 345;
		String s2;
		s2 = Integer.toString(i8);
		System.out.println(i8+1); //346
		System.out.println(s2+1); //346

		
		//Double to String
		Double.toString(23.45);
		Double.parseDouble("12");
		
		//Float
		Float.toString(23.45f);
		
	}
}
