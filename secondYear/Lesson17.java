
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 10: Simulation of Tombola drawing: The program should generate
 * unrepeated numbers from 1 to 100. The output is formatted by 10 numbers
 * in a row.
 ************************************************
*/
public class Lesson17 {
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
