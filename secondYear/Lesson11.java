/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-08
 * Question 11: Computer generates a random number between 1–100 (inclusive).
 * User tries to guess it and the computer assists in guessing by appropriate
 * (higher/lower) message. At the end the number of trials needed should be
 * printed.
 ************************************************
*/
import java.util.*;

public class Lesson11 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your guess:");
		int n = input.nextInt();

		int randomNumber = (int) (Math.random() * 100) + 1;
		int attemps = 1;
		while (n != randomNumber) {
			if (n < randomNumber) {
				System.out.println("The number is higher! Try again:");
			} else {
				System.out.println("The number is lower! Try again:");
			}
			n = input.nextInt();
			attemps++;
		}

		System.out.println("You've guessed the number " + randomNumber + " in " + attemps + " attempts!");

		input.close();
	}
}
