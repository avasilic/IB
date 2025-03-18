/*
 * Author: Aleksandar Vasilić
 * Date: 2025-03-11
 * Variables, constants, naming conventions, declaring, initializing, and
 * assign command.
 ************************************************
*/
public class Lesson2 {
	public static void main(String args[]) {
		int number; // This declares an integer variable
		number = 100; // The variable is not initialized and 100 is cur. val.
		// This is also a assign command
		// We can do init. and decl. in the same line int number = 10;

		System.out.println("number"); // This will output the word "number", not
		// the value of the variable
		System.out.println(number); // This will print the current value of the
		// variable number

		// int number = 10; Not possible because number is declared

		number = 15; // The old value is overwritten/lost
		System.out.println(number);

		// 20 = number; LHS of an assignment must be a variable

		// number = 8.2 Type mismatch: cannot convert from double to int

		System.out.println("number = " + number); // Con. cat. str. and var.

		System.out.println(2 * number); // The value of the number won't be
		// changed
		System.out.println(number);

		int secondNumber = 10;

		/*
		 * Naming conventions:
		 * Not allowed:
		 * - No space in names (e.g., second number)
		 * - using - (e.g., second-number)
		 * - using special characters (e.g., second?number)
		 * - starting with a digit (e.g., 2ndnumber). number2 is OK
		 * Encouraged:
		 * - camelCase or
		 * - snake_case
		 */

		int thirdNumber = 50;

		secondNumber = thirdNumber + 10; // We can use one variable to assign
		// to another. This will not change the value of thirdNumber

		System.out.println(secondNumber);

		thirdNumber = 500;

		System.out.println(secondNumber); // This will not be 510 as
		// thirdNumber + 10 was evaluated when thirdNumber was 50

		System.out.println(3 * 17 + 2); // The expression is evaluated immediately
		// and the result is displayed
		System.out.println("3*17+2 = " + 3 * 17 + 2); // The plus behind the 2 here
		// is concatentation, not addition. In order to get the correct result,
		System.out.println("3*17+2 = " + (3 * 17 + 2)); // Use brackets

		System.out.println("2+2 = 5");

		System.out.println(thirdNumber > 1000); // This will evaluate if this
		// condition is true

		System.out.println(thirdNumber == 500); // == is used for comparing

		System.out.println(thirdNumber != 20); // != is is not

		System.out.println(thirdNumber >= 500); // Greater than or eq

		double rate = 4.52; // Doubles can store decimal values
		rate = 10; // Doubles can store integers as well, but not the other way
		// around
		System.out.println(rate);

		double distance = 1.55E7; // We can use scientific notation. 1.55*10^7
		System.out.println(distance);

		final double Pi = 3.14; // The final keyword makes it a named constant
		// Pi = 4.14; We cannot change a constant, unlike with variables
		System.out.println(Pi);
		/*
		 * Benefits of constants:
		 * - It can prevent you from accidentally changing the value
		 * - More readable and understandable code
		 * - Replacing/changing that particular value is much easier
		 * - Avoid mistakes that are hard to find manually (esp. large codebases)
		 */
			
		// Homework: BluePelican Exercise 2 and Project from me to you
	}
}
