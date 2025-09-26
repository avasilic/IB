import java.util.Random;

/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 10: Simulation of Tombola drawing: The program should generate
 * unrepeated numbers from 1 to 100. The output is formatted by 10 numbers
 * in a row. "Smart" solution below.
 *
 ************************************************
*/
public class Lesson17_2 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		for (int i = 0; i < 100; i++) {
			numbers[i] = i + 1;
		}

		Random random = new Random();
		int remainingCount = 100;

		System.out.println("Tombola Drawing:");
		for (int draw = 1; draw <= 100; draw++) {
			int randomIndex = random.nextInt(remainingCount); // Pick random index from remaining numbers

			int drawnNumber = numbers[randomIndex];

			numbers[randomIndex] = numbers[remainingCount - 1]; // Swap with the last remaining number
			numbers[remainingCount - 1] = drawnNumber;

			remainingCount--;

			System.out.println("Draw " + draw + ": " + drawnNumber);
		}
	}
}
