import java.util.*;

public class SwitchCommand2 {
	public static void main(String args[]) {
		System.out.println("Make your arithmetic operation selection from the choices below:");
		System.out.println("A. Addition");
		System.out.println("B. Subtraction");
		System.out.println("C. Multiplication");
		System.out.println("D. Division");
		System.out.print("Your choice is:");

		Scanner kbReader = new Scanner(System.in);
		String menuInput = kbReader.nextLine();
		char choice = menuInput.charAt(0);

		System.out.print("First value:");
		double val1 = kbReader.nextDouble();
		System.out.print("Second value:");
		double val2 = kbReader.nextDouble();

		switch (choice) {
			case 'A':
				// Case 1: addition
				System.out.println(val1 + "+" + val2 + "=" + (val1 + val2));
				break;
			case 'B':
				// Case 2: subtraction
				System.out.println(val1 + "-" + val2 + "=" + (val1 - val2));
				break;
			case 'C':
				// Case 3: multiplication
				System.out.println(val1 + "x" + val2 + "=" + (val1 * val2));
				break;
			case 'D':
				// Case 4: division
				if (val2 == 0) {
					System.out.println("Division by zero is not possible.");
				} else {
					System.out.println(val1 + "/" + val2 + "=" + (val1 / val2));
				}
				break;
			default:
				// Fallthrough
				System.out.println("Unknown option. You must choose from A-D.");
		}

		kbReader.close();
	}
}
