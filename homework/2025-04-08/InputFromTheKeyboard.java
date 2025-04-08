import java.util.Scanner;

public class InputFromTheKeyboard {
	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in);

		// Q1: The user inputs three integer values from the keyboard. Calculate
		// and print their sum and the average.
		System.out.println("[Q1] Please enter the three integer values:");
		Integer firstInteger = kbReader.nextInt();
		Integer secondInteger = kbReader.nextInt();
		Integer thirdInteger = kbReader.nextInt();

		System.out.println("[Q1] Sum: " + (firstInteger + secondInteger + thirdInteger));
		System.out.println("[Q1] Average: " + ((double) (firstInteger + secondInteger + thirdInteger) / 3));

	}
}
