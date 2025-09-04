
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * Question 4: User enters one integer number. Print it in reverse.
 ************************************************
*/
import java.util.*;

public class Lesson4 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number.");
		int number = input.nextInt();

		while (number != 0) {
			System.out.print(number % 10);
			number = number / 10;
		}

		input.close();
	}
}
