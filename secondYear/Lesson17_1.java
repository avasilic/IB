
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 10: Simulation of Tombola drawing: The program should generate
 * unrepeated numbers from 1 to 100. The output is formatted by 10 numbers
 * in a row. Naive solution below.
 *
 ************************************************
*/
public class Lesson17_1 {
	public static void main(String args[]) {
		int[] tombola = new int[100];
		int count = 0;

		while (count < 100) {
			int randomNumber = (int) (Math.random() * 100) + 1;
			boolean isUnique = true;
			for (int i = 0; i < count; i++) {
				if (tombola[i] == randomNumber) {
					isUnique = false;
					break;
				}
			}

			if (isUnique) {
				tombola[count] = randomNumber;
				count++;
			}
		}

		System.out.println("Tombola drawing results:");
		for (int i = 0; i < tombola.length; i++) {
			System.out.print(tombola[i] + "\t");
			if ((i + 1) % 10 == 0) {
				System.out.println("\n");
			}
		}
	}
}
