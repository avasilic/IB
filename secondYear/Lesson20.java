/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question X: Implement bubble sort (worse implementation)
 ************************************************
*/
public class Lesson20 {
	public static void main(String args[]) {
		int[] integers = { 10, 12, 8, 7, 1, 5, 2, 4 };

		boolean oneMorePassRequired = true;

		while (oneMorePassRequired) {
			oneMorePassRequired = false;
			for (int i = 0; i < integers.length - 1; i++) {
				if (integers[i] > integers[i + 1]) {
					oneMorePassRequired = true;
					int tempInt = integers[i];
					// Note to self: order is important here
					integers[i] = integers[i + 1];
					integers[i + 1] = tempInt;
				}
			}
		}

		System.out.println("The sorted array is:");

		for (int i = 0; i < integers.length - 1; i++) {
			System.out.print(integers[i] + " ");
		}
	}
}
