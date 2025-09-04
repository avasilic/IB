
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * Question 8: Convert the entered denary (decimal) integer value into the
 * corresponding hexadecimal number.
 ************************************************
*/
import java.util.*;

public class Lesson8 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter number in denary form:");
		int n = input.nextInt();
		int originalN = n;

		String hex = "";

		while (n > 0) {
			int remainder = n % 16;
			if (remainder < 10) {
				hex = remainder + hex;
			} else {
				switch (remainder) {
					case 10:
						hex = "A" + hex;
						break;
					case 11:
						hex = "B" + hex;
						break;
					case 12:
						hex = "C" + hex;
						break;
					case 13:
						hex = "D" + hex;
						break;
					case 14:
						hex = "E" + hex;
						break;
					case 15:
						hex = "F" + hex;
						break;
				}
			}
			n /= 16;
		}

		System.out.println("The hexadecimal representation of " + originalN + " is: " + hex);

		input.close();
	}
}
