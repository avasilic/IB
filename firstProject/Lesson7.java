/*
 * Author: Aleksandar Vasilić
 * Date: 2025-04-01
 * Common math functions, scientific notation, binary and hexadecimal numbers
 * in Java.
 ************************************************
*/

public class Lesson7 {
	public static void main(String args[]) {
		double d = 1.23E3; // This is the same as 1.23 * 10^3
		System.out.println(d);

		System.out.println(Math.pow(2, 4)); // 2^4
		System.out.println(Math.pow(2.3, 4.8)); // Doesn't matter if its decimal
		System.out.println(Math.pow(2, -1)); // Doesn't matter if its negative

		System.out.println(Math.sqrt(16)); // sqrt of 16. The result of
		// Math.sqrt() is always a decimal number.
		System.out.println(Math.max(d, 1000)); // Returns the number which is
		// highest

		double e = Math.sqrt(22);
		System.out.println(e);
	}
}
