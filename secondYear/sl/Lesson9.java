/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * Question 9: A binary value is entered by the user. Print matching denary
 * representation using a while loop and no Math.pow().
 ************************************************
*/
import java.util.*;

public class Lesson9 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter number in binary form:");
		int n = input.nextInt();
		int originalN = n;

		int denary = 0;
		int position = 1;
		while (n > 0) {
			int lastDigit = n % 10;
			denary += lastDigit * position;
			position *= 2; // Move to the next power of 2
			n /= 10;
		}

		System.out.println("The denary representation of " + originalN + " is: " + denary);

		input.close();
	}
}
