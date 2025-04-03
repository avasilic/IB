/*
 * Author: Aleksandar Vasilić
 * Date: 2025-04-03
 * Input from the keyboard. Related to Lesson 7 in the Java BluePelican book.
 ************************************************
*/

import java.io.*; // Import the java.io (io=input/output) package
import java.util.*;

public class Lesson8 {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);
		/*
		 * Available methods of the scanner:
		 * nextInt() - Gets the next integer from the keyboard. Returns int
		 * nextDouble() - Gets the next double from the keyboard. Returns double
		 * next() - Gets the next token from the keyboard. Returns String
		 * nextLine() - Gets the next line from the keyboard. Returns String
		 */
		System.out.println("Please enter one integer number:");
		int number = kbReader.nextInt(); // Read the integer from the keyboard
		// Java automatically removes whitespace and so ' 50 ' will
		// still output 50
		System.out.println("You entered " + number);
		System.out.println("and its doubled value is " + 2 * number);

		System.out.println("Please enter width and length of rectangle");
		double width = kbReader.nextDouble();
		double length = kbReader.nextDouble();
		// We do not care how the above two are typed—it doesn't matter whether
		// they are in the same line or if there are two lines
		
		double area = width * length;
		System.out.println("The area is " + area);
		System.out.println("The permimiter is" + 2 * (width + length));
	}
}
