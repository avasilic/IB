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
		
		System.out.println(second.substring(2)); // In Java, strings are
	 	// zero-indexed. Calling substring(2) will, from that position on, 
	 	// return the substring starting from the third character.
		// Zero-indexed means that counting starts from 0. So, n = 0, e = 1, ...
	}
}
