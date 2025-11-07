import java.util.*;

/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 11b: User enters 20 elements of an integer array. Program should
 * shift all elements one position to the right.
 ************************************************
*/
public class Lesson18_2 {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);

		int[] integers = new int[20];
		for (int i = 0; i < integers.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			integers[i] = kbReader.nextInt();
		}

		int lastInteger = integers[integers.length - 1];
		for (int i = integers.length - 1; i > 0; i--) {
			integers[i] = integers[i - 1];
		}
		integers[0] = lastInteger;

		System.out.println("Array after shifting elements to the right:");
		for (int i = 0; i < integers.length; i++) {
			System.out.print(integers[i] + " ");
		}

		kbReader.close();
	}
}
