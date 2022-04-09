package basics;

public class App {

	public static void main(String[] args) {
		// how to create an object
		// ClassName refVariableName = new Call to the constructor of the class

		Students s1 = new Students();
		s1.studentName = "Arvina";
		s1.schoolName = "W2A";
		s1.age = 22;

		s1.attendLectures();

		Students s2 = new Students();
		s2.studentName = "Anand";
		s2.schoolName = "W2A";

		System.out.println(s1.studentName);
		System.out.println(s2.studentName);

		System.out.println(s1.schoolName);
		System.out.println(s2.schoolName);
		
		Students s3 = new Students();
		System.out.println(s3.schoolName);
		System.out.println(s3.studentName);
		System.out.println(s3.studentId);
		
		System.out.println(Students.schoolName);
		
		
		System.out.println("------------");
		
		s1.printStudentName();
		s2.printStudentName();
		
		System.out.println();
		
		
		

	}
}
