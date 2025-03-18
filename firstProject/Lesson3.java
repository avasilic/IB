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

		System.out.println(second.substring(2, 6)); // Returns the substring
		// from the third character to the fifth character. The first one is
		// inclusive. The second is exclusive
		// 2 and 6 are arguments for the method call

		// System.out.println(second.substring()); This will error as we did not
		// provide any arguments

		// The existence of two methods with the same name with a different
		// number of arguments is an example of polymorphism. We can also do
		// polymorphism with types, not just the number of arguments

		// Escape sequences
		System.out.println("Happy\nNew\nYear"); // Everything in quotation marks
		// will be printed except if we have an escape sequence. \n is an escape
		// sequence that will create a new line
	}
}
