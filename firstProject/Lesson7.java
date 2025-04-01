/*
 * Author: Aleksandar Vasilić
 * Date: 2025-04-01
 * Common math functions, scientific notation, binary and hexadecimal numbers
 * in Java. Related to Lessons 6 (math operations) and 14 (binary and hex in
 * Java) in the Java BluePelican book. 
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
		System.out.println(Math.round(e)); // Rounding to nearest integer
		System.out.println(Math.floor(e)); // Rounds down to the nearest integer
		// with a return type of a double
		System.out.println(Math.ceil(e)); // Rounding to the nearest integer
		// but with a return type of a double. It *always* rounds up.

		double f = -3.82;
		System.out.println(Math.round(f)); // -4 since -3.82 is closer to -4 than -3
		System.out.println(Math.floor(f)); // -4.0 since -3.82 is closer to -4 than -3
		System.out.println(Math.ceil(f)); // -3.0 since -3.82 is closer to -3 than -4
		System.out.println(Math.abs(f)); // Returns the absolute value

		System.out.println(Math.PI); // Math constant

		System.out.println(Math.sin(Math.PI / 6)); // 0.49999999999999994. In
		// a similar fashion, cos and tan also exist.
		System.out.println(Math.asin(0.5)); // 0.5235987755982989 which is PI/6
		System.out.println(Math.toDegrees(Math.asin(0.5))); // The conversion is
		// inexact and therefore the result is30.000000000000004.

		System.out.println(Math.sin(Math.toRadians(30))); // This conversion is
		// also inexact.
	}
}
