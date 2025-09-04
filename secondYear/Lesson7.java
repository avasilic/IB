
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * Question 7: Convert the entered denary (decimal) integer value into the
 * corresponding binary.
 ************************************************
*/
import java.util.*;

public class Lesson7 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter number in denary form:");
		int n = input.nextInt();
		int originalN = n;

		String binary = "";

		while (n > 0) {
			int remainder = n % 2;
			binary = remainder + binary;
			n /= 2;
		}

		System.out.println("The binary representation of " + originalN + " is: " + binary);

		input.close();
	}
}
