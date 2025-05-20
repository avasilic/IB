import java.util.*;

public class Question17d {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the number (6-digit) you'd like to analyze:");
		int number = input.nextInt();
		int originalNumber = number;

		int counter1 = 0;
		for (int i = 0; i < 6; i++) {
			int digit = number % 10;
			if (digit % 3 == 0) {
				counter1++;
			}
			number /= 10;
		}
		System.out.println("No. divisible by 3: " + counter1);

		System.out.println("Please enter a second divisor:");
		int divisor = input.nextInt();
		int counter2 = 0;

		number = originalNumber;
		for (int i = 0; i < 6; i++) {
			int digit = number % 10;
			if (digit % divisor == 0) {
				counter2++;
			}
			number /= 10;
		}
		System.out.println("No. divisible by " + divisor + ": " + counter2);

		input.close();
	}
}
