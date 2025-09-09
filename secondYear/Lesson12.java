
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-09
 * Question 11: Computer generates a random number between 1–100 (inclusive).
 * User tries to guess it and the computer assists in guessing by appropriate
 * (higher/lower) message. At the end the number of trials needed should be
 * printed.
 ************************************************
*/
import java.util.*;

public class Lesson12 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String option;
		boolean exitProgram = false;

		do {
			System.out.println("===Main Menu===");
			System.out.println("1. Option 1");
			System.out.println("2. Option 2");
			System.out.println("3. Option 3");
			System.out.println("0. Exit");

			option = input.nextLine().trim();

			switch (option) {
				case "0": {
					System.out.println("Goodbye...");
					exitProgram = true;
					break;
				}
				case "1": {
					System.out.println("Option 1 is executed");
					break;
				}
				case "2": {
					System.out.println("Option 2 is executed");
					break;
				}
				case "3": {
					System.out.println("Option 2 is executed");
					break;
				}
				default: {
					System.out.println("Invalid option '" + option + "' selected. Try again");
				}
			}
		} while (exitProgram != true);

		input.close();
	}
}
