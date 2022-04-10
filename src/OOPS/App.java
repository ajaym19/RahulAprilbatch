package OOPS;



public class App {

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.doExercise();
		
		Teachers t1 =  new  Teachers();
		t1.doExercise();
		t1.delvierTraining();
		t1.toString();
		
		TestBase tb = new TestBase();
		tb.doExercise();
		
		MethodOverloadingDemo mo = new MethodOverloadingDemo();
		mo.sum(1, 2, 3);
		mo.sum(1, 2.5f);
		//mo.sum(1);
		System.out.println(mo.returnName());
		mo.returnName();
		
	}
	
}
