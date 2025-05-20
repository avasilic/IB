import java.util.*;

public class Question17a {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the number you'd like to reverse:");
		int number = input.nextInt();

		int reversedNumber = 0;
		int originalNumber = number;

		for (int i = 0; i < 6; i++) {
			int lastDigit = number % 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			number = number / 10;
		}

		System.out.println("The reverse of " + originalNumber + " is " + reversedNumber);

		input.close();
	}
}
