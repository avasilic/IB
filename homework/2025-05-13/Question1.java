import java.util.*;

public class Question1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the last positive integer you would like to be printed");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n---Additional request---\n\n");

		// Additional request
		for (int i = 1; i <= number; i++) {
			System.out.print(i + "\t");
			if (i % 10 == 0) {
				System.out.print("\n");
			}
		}

		input.close();
	}
}
