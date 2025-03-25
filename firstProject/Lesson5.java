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
	}
}
