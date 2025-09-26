import java.util.*;

/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 11a: User enters 20 elements of an integer array. Program should
 * shift all elements one position to the left whereas the first element of the
 * array must be placed at the end of the array – on the last position.
 * Print the array with the new order.
 ************************************************
*/
public class Lesson18_1 {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);

		int[] integers = new int[20];
		for (int i = 0; i < integers.length; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			integers[i] = kbReader.nextInt();
		}

		int firstInteger = integers[0];
		for (int i = 0; i < integers.length - 1; i++) {
			integers[i] = integers[i + 1];
		}

		integers[integers.length - 1] = firstInteger;

		System.out.println("Array after shifting elements to the left:");
		for (int i = 0; i < integers.length; i++) {
			System.out.print(integers[i] + " ");
		}

		kbReader.close();
	}
}
