/*
 * Author: Aleksandar Vasilić
 * Date: 2025-03-28
 * Swapping of variables.
 ************************************************
*/

public class Lesson6 {
	public static void main(String args[]) {
		int h = 17;
		int q = 5;

		System.out.println("h=" + h + " q=" + q);

		// Swap the values of the variables
		int temp = h;
		h = q;
		q = temp;

		System.out.println("h=" + h + " q=" + q);

		// Now lets swap but with math operators not temp operators, but we
		// act like we dont know the values
		h = h + q;
		q = h - q;
		h = h - q;

		System.out.println("h=" + h + " q=" + q);
		
		int m = 100;
		int n = 20;
		System.out.println("m=" + m + " n=" + n);
		
		// Now lets swap with multiplication and division
		m = m * n;
		n = m / n;
		m = m / n;
		
		System.out.println("m=" + m + " n=" + n);
	}
}
