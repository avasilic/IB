/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * Question 6: User enters two integer numbers n and m. Calculate the result of
 * the integer division n / m, without using operation /.
 ************************************************
*/
import java.util.*;

public class Lesson6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the first number, n.");
		int n = input.nextInt();

		System.out.println("Please enter the second number, m.");
		int m = input.nextInt();

		int remainder = n;
		int count = 0;
		while (remainder >= m) {
			remainder -= m;
			count++;
		}

		System.out.println("The result of the integer division " + n + "/" + m + " is: " + count);

		input.close();
	}
}
