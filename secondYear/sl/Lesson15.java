
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 3: Create an array of 100 elements such that the first one is 1, second is 2, then 3,4 etc. Print all elements. Use two for loops
 ************************************************
*/
public class Lesson15 {
	public static void main(String args[]) {
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		for (int j = 0; j < numbers.length; j++) {
			if (j % 10 == 0) {
				System.out.println("\n");
			}
			System.out.print(numbers[j] + "\t");
		}
	}
}
