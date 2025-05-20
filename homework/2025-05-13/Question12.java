import java.util.*;

public class Question12 {
	public static void main(String args[]) {
		System.out.println("a) Three-digit numbers divisible by 3:");

		for (int i = 1; i <= 999; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		
		// Part b
		
		Scanner input = new Scanner(System.in);
	 	System.out.print("\nEnter a number k to check divison by:");
		int k = input.nextInt();
		
		for (int i = 1; i <= 999; i++) {
			if (i % k == 0) {
				System.out.print(i + " ");
			}
		}
		
		input.close();

		/*
		 * Version without if
		 * int partACount = 0;
		 * int partASum = 0;
		 * 
		 * System.out.println("a) Three-digit numbers divisible by 3:");
		 * 
		 * // 12 is the first 2 digit number divisible by 3
		 * for (int i = 102; i <= 999; i += 3) {
		 * System.out.print(i + " ");
		 * partACount++;
		 * partASum += i;
		 * }
		 * 
		 * System.out.println("\n\nTotal count: " + partACount);
		 * System.out.println("Sum: " + partASum);
		 * 
		 * // Part b
		 * Scanner input = new Scanner(System.in);
		 * System.out.print("Enter a number k to check divison by:");
		 * int k = input.nextInt();
		 * 
		 * // sorry I couldn't come up with it on my own!
		 * // https://stackoverflow.com/a/2745086
		 * int start = ((100 + k - 1) / k) * k;
		 * int partBCount = 0;
		 * int partBSum = 0;
		 * 
		 * System.out.println("Three-digit numbers divisible by " + k + ":");
		 * 
		 * for (int n = start; n < 1000; n += k) {
		 * System.out.print(n + " ");
		 * partBCount++;
		 * partBSum += n;
		 * }
		 * 
		 * System.out.println("\n\nTotal count: " + partBCount);
		 * System.out.println("Sum: " + partBSum);
		 * %/
		 * 
		 * input.close();
		 */
	}
}
