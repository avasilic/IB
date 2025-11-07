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
		int numberOfPasses = 0;
		int numberOfComparisons = 0;
		int numberOfSwitches = 0;

		while (oneMorePassRequired) {
			oneMorePassRequired = false;
			numberOfPasses++;
			for (int i = 0; i < integers.length - 1; i++) {
				numberOfComparisons++;
				if (integers[i] > integers[i + 1]) {
					oneMorePassRequired = true;
					numberOfSwitches++;
					int tempInt = integers[i];
					// Note to self: order is important here
					integers[i] = integers[i + 1];
					integers[i + 1] = tempInt;
				}
			}

			System.out.print("Pass " + numberOfPasses + ": ");
			for (int i = 0; i < integers.length; i++) {
				if (i >= integers.length - numberOfPasses) {
					System.out.print("[" + integers[i] + "]\t");
				} else {
					System.out.print(integers[i] + "\t");
				}
			}
			System.out.println();
		}

		System.out.println("The sorted array is:");

		for (int i = 0; i < integers.length; i++) {
			System.out.print(integers[i] + "\t");
		}

		System.out.println();

		System.out.println("Number of comparisons: " + numberOfComparisons);
		System.out.println("Number of switches: " + numberOfSwitches);
	}
}
