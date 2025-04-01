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
	}
}
