import java.util.*;

public class Question8Four {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Please enter three integers");

		int a = kbReader.nextInt();
		int b = kbReader.nextInt();
		int c = kbReader.nextInt();

		int max = 0;

		if (a >= b && a >= c) {
			max = a;
		}
		if (b >= a && b >= c) {
			max = b;
		}
		if (c >= a && c >= b) {
			max = c;
		}
		System.out.println("The maximum is " + max);

		kbReader.close();

		/*
		 * Testing:
		 * We need to test each branch.
		 * Case 1: a > b, a > c
		 * Input: a = 5, b = 3, c = 2
		 * Output: The maximum is 5
		 * 
		 * Case 2: a > b, a <= c
		 * Input: a = 5, b = 3, c = 8
		 * Output: The maximum is 8
		 * 
		 * Case 3: a <= b, b > c
		 * Input: a = 3, b = 5, c = 2
		 * Output: The maximum is 5
		 * 
		 * Case 4: a <= b, b <= c
		 * Input: a = 3, b = 5, c = 8
		 * Output: The maximum is 8
		 * 
		 * Case 4: a = b, c > b
		 * Input: a = 5, b = 5, c = 8
		 * Output: The maximum is 8
		 * 
		 * Case 5: a = b = c
		 * Input: a = 5, b = 5, c = 5
		 * Output: The maximum is 5
		 */
	}
}
