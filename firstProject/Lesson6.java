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
	}
}
