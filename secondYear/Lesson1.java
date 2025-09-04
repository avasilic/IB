
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * A user enters the base and the upper limit. List all of
 * the powers of the given base lesser than the limit. Additionally,
 * try to count them and find their sum. You must use a while loop.
 ************************************************
*/
import java.util.*;

public class Lesson1 {
	public static void main(String args[]) {
		// Question 1: A user enters the base and the upper limit. List all of
		// the powers of the given base lesser than the limit. Additionally,
		// try to count them and find their sum. You must use a while loop.

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the base of the numbers you'd like to print.");
		int base = input.nextInt();

		System.out.println("Please enter the upper limit of the numbers you'd like to print.");
		int upperLimit = input.nextInt();

		int currentValue = base;
		int count = 0;
		int sum = 0;

		while (currentValue < upperLimit) {
			System.out.print(currentValue + " ");
			sum += currentValue;
			count++;
			currentValue *= base;
		}

		System.out.println("\nThe count of the numbers is: " + count);
		System.out.println("The sum of the numbers is: " + sum);

		input.close();
	}
}
