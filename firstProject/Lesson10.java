/*
 * Author: Aleksandar Vasilić
 * Date: 2025-05-13
 * Looping
 ************************************************
*/

import java.util.*;

public class Lesson10 {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Please enter the last positive integer you would like to be printed");
		int number = kbReader.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n---Additional request---\n\n");

		// Additional request
		for (int i = 1; i <= number; i++) {
			System.out.print(i + "\t");
			if (i % 10 == 0) {
				System.out.print("\n");
			}
		}

		kbReader.close();
	}
}
