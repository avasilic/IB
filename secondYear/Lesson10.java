/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-08
 * Question 10: Hexadecimal value is entered by the user. Print the matching
 * denary representation.
 ************************************************
*/
import java.util.*;

public class Lesson10 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter number in hexadecimal form:");
		String n = input.nextLine();
		String originalN = n;

		int denary = 0;
		int position = 1;
		int length = n.length();
		
		while (length > 0) {
			char lastChar = n.charAt(length - 1);
			int value;
			if (lastChar >= '0' && lastChar <= '9') {
				value = lastChar - '0'; // Convert char digit to its int value
			} else {
				value = 10 + (lastChar - 'A'); // Convert A-F to its int value
			}
			denary += value * position;
			position *= 16; // Move to the next power of 16
			length--;
		}

		System.out.println("The denary representation of " + originalN + " is: " + denary);

		input.close();
	}
}
