import java.util.*;

public class SwitchCommand1 {
	public static void main(String args[]) {
		System.out.println("Make your arithmetic operation selection from the choices below:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Your choice is:");

		Scanner kbReader = new Scanner(System.in);
		int choice = kbReader.nextInt();

		System.out.print("First value:");
		double val1 = kbReader.nextDouble();
		System.out.print("Second value:");
		double val2 = kbReader.nextDouble();

		switch (choice) {
			case 1:
				// Case 1: addition
				System.out.println(val1 + "+" + val2 + "=" + (val1 + val2));
				break;
			case 2:
				// Case 2: subtraction
				System.out.println(val1 + "-" + val2 + "=" + (val1 - val2));
				break;
			case 3:
				// Case 3: multiplication
				System.out.println(val1 + "x" + val2 + "=" + (val1 * val2));
				break;
			case 4:
				// Case 4: division
				if (val2 == 0) {
					System.out.println("Division by zero is not possible.");
				} else {
					System.out.println(val1 + "/" + val2 + "=" + (val1 / val2));
				}
				break;
			default:
				// Fallthrough
				System.out.println("Unknown option. You must choose from 1-4.");
		}

		kbReader.close();
	}
}
