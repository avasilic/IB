import java.util.*;

public class Question2 {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number you'd like to find the three-digit equivalents for:");
		int number = input.nextInt();

		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int m = 0; m < 10; m++) {
					if ((i + j + m) == number) {
						System.out.println("" + i + j + m + " (" + i + "+" + j + "+" + m + "=" + (number) + ")");
					}
				}
			}
		}

		input.close();
	}
}
