/*
 * Author: Aleksandar Vasilić
 * 2025
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
	}
}
