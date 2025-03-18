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
	}
}
