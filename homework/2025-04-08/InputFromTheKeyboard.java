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

		// Q2: The equation of the straight line y = kx + n is given by entering
		// coefficients k and n (real numbers). For an entered x, print the
		// corresponding y value. Use nextDouble()
		System.out.println("[Q2] Please enter the coefficients k and n for the equation of the line y=kx+n");
		Double k = kbReader.nextDouble();
		Double n = kbReader.nextDouble();
		System.out.println("[Q2] Please enter the x value for the line:");
		Double x = kbReader.nextDouble();
		System.out.println("[Q2] y = " + (k * x + n));
	}
}
