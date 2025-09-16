
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 4: Create an array of 50 integers randomly generated between 100
 * and 150 inclusively. Print the selements by 10 in the each row.
 ************************************************
*/
public class Lesson16 {
	public static void main(String args[]) {
		int[] numbers = new int[50];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 51) + 100; // Generates a number between 100 and 150
		}

		for (int j = 0; j < numbers.length; j++) {
			if (j % 10 == 0) {
				System.out.println("\n");
			}
			System.out.print(numbers[j] + "\t");
		}
	}
}
