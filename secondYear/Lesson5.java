
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * Question 5: User enters two integer numbers n and m. Calculate the remainder
 * from the integer division n / m, without using % operator.
 ************************************************
*/
import java.util.*;

public class Lesson5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number, n.");
		int n = input.nextInt();

		System.out.println("Please enter the first number, m.");
		int m = input.nextInt();
		
		int remainder = n;
		while (remainder >= m) {
			remainder -= m;
		}
		
		System.out.println("The remainder of the integer division n / m is: " + remainder);
		
		input.close();
	}
}
