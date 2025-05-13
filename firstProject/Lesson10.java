/*
 * Author: Aleksandar Vasilić
 * Date: 2025-05-13
 * Looping
 ************************************************
*/

import java.util.*;

public class Lesson10 {
	public static void main(String args[]) {
		// Question 1
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the last positive integer you would like to be printed");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n---Additional request---\n\n");

		// Additional request
		for (int i = 1; i <= number; i++) {
			System.out.print(i + "\t");
			if (i % 10 == 0) {
				System.out.print("\n");
			}
		}

		// Question 2
		System.out.println("\nPlease enter the lower bound of the range you'd like to print");
		int lowerBoundQ2 = input.nextInt();
		System.out.println("Please enter the upper bound of the range you'd like to print");
		int upperBoundQ2 = input.nextInt();

		for (int i = lowerBoundQ2; i <= upperBoundQ2; i++) {
			System.out.print(i + " ");
		}

		input.close();
	}
}
