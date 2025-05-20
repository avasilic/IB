import java.util.*;

public class Question17c {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the number you'd like to sum of digits of:");
		int number = input.nextInt();
		int sum = 0;

		for (int i = 0; i < 6; i++) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}

		System.out.println("Sum: " + sum);

		input.close();
	}
}
