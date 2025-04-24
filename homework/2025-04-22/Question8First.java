import java.util.*;

public class Question8First {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Please enter three integers");

		int a = kbReader.nextInt();
		int b = kbReader.nextInt();
		int c = kbReader.nextInt();

		if (a > b) {
			// Branch 1
			if (a > c) {
				// Branch 1.1
				System.out.println("The maximum is " + a);
			} else {
				// Branch 1.2
				System.out.println("The maximum is " + c);
			}
		} else {
			// Branch 2
			if (b > c) {
				// Branch 2.1
				System.out.println("The maximum is " + b);
			} else {
				// Branch 2.2
				System.out.println("The maximum is " + c);
			}
		}
		
		kbReader.close();

		/*
		 * Testing:
		 * We need to test each branch.
		 * Case 1: a > b, a > c
		 * Input: a = 5, b = 3, c = 2
		 * Output: The maximum is 5
		 * Branches: a > b -> a > c
		 * 
		 * Case 2: a > b, a <= c
		 * Input: a = 5, b = 3, c = 8
		 * Output: The maximum is 8
		 * Branches: a > b -> a <= c
		 * 
		 * Case 3: a <= b, b > c
		 * Input: a = 3, b = 5, c = 2
		 * Output: The maximum is 5
		 * Branches: a <= b -> b > c
		 * 
		 * Case 4: a <= b, b <= c
		 * Input: a = 3, b = 5, c = 8
		 * Output: The maximum is 8
		 * Branches: a <= b -> b <= c
		 *	
		 * Needs more tests.
		 */
	}
}
