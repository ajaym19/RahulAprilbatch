package basics;

public class LoopingDemo {

	public static void main(String[] args) {

		// print from 1 to 10
		// but when number is 3, print Anita
		// but when number is 5, print Arvina
		// but when number is 5, print Vinayak

//		for (int i = 1; i <= 10; i++) {
//			// System.out.println(i);
//			if (i == 3) {
//				System.out.println("Anita");
//			} else if (i == 5) {
//				System.out.println("Arvina");
//			} else if (i == 7) {
//				System.out.println("Vinayak");
//			} else {
//				System.out.println(i);
//			}
//		}

		// print 1 to 10, but when 6 comes, stop printing and dont print 6 also
//		for (int i = 1; i <= 10; i++) {
//
//			if (i == 6) {
//				break;
//			} else {
//				System.out.println(i);
//			}
//		}

		// we dont know the limit or size
		// while and do while
		int j = 12;
		while (j <= 10) {
			System.out.println(j);
			j++;
		}

		int k = 12;
		do {
			System.out.println(k);
			k++;
		} while (k <= 10);

		// switch:

		// print days of week based on number, 1 = Monday
		// using else if as HW

		int day = 21;

		switch (day) {

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Please enter values from 1-7");

		}

		for (int i = 1; i < 6; i++) {
			for (int l = 1; l < i; l++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
