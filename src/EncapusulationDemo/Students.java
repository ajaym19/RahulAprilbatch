package EncapusulationDemo;

public class Students {

	// Access Modifiers
	// Encapsulation: wrapping of data and methods
	// Also known as Getters and Setters

	private int studentId;// r -no, w-no
	private int rollNo; // r - yes, w - no
	private String name; // r- yes, w -yes
	private static String schoolName;
	private long phoneNumber; // r-yes, w-yes
	protected int p1;
	int p2;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//check over here
		boolean logical = false;
		if (logical == true) {
			this.name = name;
		}
		else {
			System.out.println("Cannot update as criteria does not match");
		}
		
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getRollNo() {
		return rollNo;
	}

	
	/*
	 * Access Modifiers
	 * private: can be accessed only within the class
	 * protected: within the package + outside the package, only by child class
	 * default: within the package
	 * public: can be access everywhere
	 */
	
}
