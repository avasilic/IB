import java.util.*;

public class Question3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter the lower bound of the range you'd like to print");
		int lowerBoundQ3 = input.nextInt();
		System.out.println("Please enter the upper bound of the range you'd like to print");
		int upperBoundQ3 = input.nextInt();

		// Swap
		if (lowerBoundQ3 > upperBoundQ3) {
			int temp = lowerBoundQ3;
			lowerBoundQ3 = upperBoundQ3;
			upperBoundQ3 = temp;
		}

		for (int i = lowerBoundQ3; i <= upperBoundQ3; i++) {
			System.out.print(i + " ");
		}

		input.close();
	}
}
