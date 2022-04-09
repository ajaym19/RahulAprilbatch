package basics;

public class Students {
	
	
	/*
	 * Variables:
	 * 1. Global: Instance and Static
	 * 2. Local
	 */
	//Instance(Object) and Static
	
	//if you want to access no variables or only static variables from a method, then make that method as static
	//static members are loaded first - 1
	//after that instance members are loaded - 2
	

	int studentId;
	int rollNo;
	String studentName;
	long mobileNo;
	int age;
	String bloodGroup;
	static String schoolName;
	
	public void attendLectures() {
		System.out.println("Students are attending Lectures");
	}
	
	public void markAttendance() {
		rollNo = 1;
		schoolName = "IIT";
		System.out.println("Students are marking attendance");
	}
	
	public void doHomework() {
		System.out.println("Students are doing homework");
	}
	
	public void doExercise() {
		System.out.println("Students are doing exercises");
	}
	
	public void printStudentName() {
		System.out.println(studentName);
		System.out.println(schoolName);
		
	}
	
	public static void showSchoolName() {
		//from static area we cannot access instance members or methods
		System.out.println("Printing some information");
		System.out.println(schoolName);
		
		
	}
}
