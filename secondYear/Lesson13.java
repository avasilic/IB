
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-11
 * Question 13: A user enters a number n and another integer m for comparison, followed by n integer numbers to be compared with m. How many of these integers were greater than the number m? Do not use arrays.
 ************************************************
*/
import java.util.*;

public class Lesson13 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values to compare: ");
		int n = input.nextInt();
		System.out.print("Enter the comparison number (m): ");
		double m = input.nextDouble();

		int countGreater = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter value " + (i + 1) + ": ");
			double currentNumber = input.nextDouble();
			if (currentNumber > m) {
				countGreater++;
			}
		}

		System.out.println("Number of values greater than " + m + ": " + countGreater);

		input.close();
	}
}
