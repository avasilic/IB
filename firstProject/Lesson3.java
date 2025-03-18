/*
 * Author: Aleksandar Vasilić
 * Date: 2025-03-18
 * String variables, string operations, escape sequences
 ************************************************
*/

public class Lesson3 {
	public static void main(String args[]) {
		String first = "Happy"; // The value must be written between quotation
		// marks
		String second = "New Year";
		System.out.println(first + second); // No blank in between Happy and
		// New Year
		System.out.println(first + " " + second);

		// String methods

		System.out.println(first.length()); // Length is a method so we use ()
		// to call it. It returns the number of characters in the string

		System.out.println(first.toUpperCase()); // Makes all characters
		// uppercase
		System.out.println(first); // This shows that these methods do not
		// mutate the string

		second = second.toLowerCase(); // The value of second is changed here
		System.out.println(second);
	}
}
