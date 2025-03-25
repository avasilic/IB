/*
 * Author: Aleksandar Vasilić
 * Date: 2025-03-25
 * Use of numerical variables, casting, and math operations. Related to Lesson 4
 * in the Java BluePelican book. 
 ************************************************
*/

public class Lesson5 {
	public static void main(String args[]) {
		int a = 15;
		double b = 12.95;
		System.out.println(a - 2 * 10 / 5 - (3 - 5) * 2); // PEMDAS, from left-to-right

		System.out.println(a / 4); // Java will write down the whole number
		// since it is an integer division (3)
		System.out.println(a / 4.0); // Java will write down the decimal number
		// since it is a double division (3.75)

		System.out.println((double) a / 4); // We've now casted the integer to a double (temporarily of course)
		System.out.println((double) (a / 4));

		System.out.println(a % 7); // % is the remainder operator. This will
		// return the remainder of a divided by 7 (1)
		System.out.println(a % 3); // Remainder is 0. The modulus operator can
		// be useful when needing to check if two numbers are divisible by each
		// other

		a = a + 1; // Remember that = is the assignment operator, not the equal
		// operator. The equal operator is ==

		a++; // a++ will automatically set the variable value to a+1. It is the
		// same as a = a+1
		++a; // a++ will use a in an expression then increase it by 1. ++a will
		// first increase a by 1 then use it in an expression

		System.out.println(a); // Prints the current value of a
		System.out.println(a++); // Prints current value of a, then increments
		// a afterward (post-increment: use value first, then increment)
		System.out.println(a); // Prints the updated value of a after
		// post-increment

		System.out.println(++a); // Increments a first, then prints the new
		// value (pre-increment: increment first, then use value)

		System.out.println(a++ + a); // Evaluates as: (current a) +
		// (incremented a). First uses current value in expression, then
		// increments. Right side 'a' reflects the incremented value
		// Example: if a=20, calculates 20 + 21 = 41, a becomes 21

		System.out.println(++a + a); // Evaluates as: (incremented a) + (same
		// incremented a). First increments a, then uses that value twice
		// Example: if a=21, increments to 22, then calculates 22 + 22 = 44

		a += 1; // This will increment a by 1
	}
}
