import java.util.*;

/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 2: User enters a number n and then enters n integer numbers.
 * Following that, a new integer number m for comparison is entered. How many
 * of these n integers were greater than the m?
 ************************************************
*/
public class Lesson14 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of values to compare: ");
		int n = input.nextInt();
		int numbers[] = new int[n];

		for (int i = 0; i < numbers.length(); i++) {
			System.out.print("Enter value " + (i + 1) + ": ");
			numbers[i] = input.nextInt();
		}

		System.out.print("Enter the comparison number (m): ");
		int m = input.nextInt();

		int countGreater = 0;
		for (int i = 0; i < numbers.length(); i++) {
			if (numbers[i] > m) {
				countGreater++;
			}
		}

		System.out.println("Number of values greater than " + m + ": " + countGreater);

		input.close();
	}
}
