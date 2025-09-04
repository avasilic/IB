
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * A user enters an integer number. Find out how many digits it has.
 ************************************************
*/
import java.util.*;

public class Lesson3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number.");
		int number = input.nextInt();

		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}

		System.out.println("The amount of digits is: " + count);

		input.close();
	}
}
