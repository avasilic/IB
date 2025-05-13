import java.util.*;

public class Question3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter the lower bound of the range you'd like to print");
		int lowerBound = input.nextInt();
		System.out.println("Please enter the upper bound of the range you'd like to print");
		int upperBound = input.nextInt();

		// Swap
		if (lowerBound > upperBound) {
			int temp = lowerBound;
			lowerBound = upperBound;
			upperBound = temp;
		}

		for (int i = lowerBound; i <= upperBound; i++) {
			System.out.print(i + " ");
		}

		input.close();
	}
}
