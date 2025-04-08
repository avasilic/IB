import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in);

		// Q1: The user inputs three integer values from the keyboard. Calculate
		// and print their sum and the average.
		System.out.println("Please enter the three integer values:");
		Integer firstInteger = kbReader.nextInt();
		Integer secondInteger = kbReader.nextInt();
		Integer thirdInteger = kbReader.nextInt();

		System.out.println("Sum: " + (firstInteger + secondInteger + thirdInteger));
		System.out.println("Average: " + ((double) (firstInteger + secondInteger + thirdInteger) / 3));
		
		kbReader.close();
	}
}
