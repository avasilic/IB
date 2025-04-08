import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in);

		// Q3: The user enters the length of the hypotenuse and one leg.
		// Calculate and print the value of the other leg.
		System.out.println("Please enter the length of the hypotenuse of a triangle:");
		Double hypotenuse = kbReader.nextDouble();
		System.out.println("Please enter the length of one leg of the triangle:");
		Double leg = kbReader.nextDouble();

		// Using the formula a^2 + b^2 = c^2, so c = sqrt(a^2 + b^2)
		Double otherLeg = Math.sqrt((hypotenuse * hypotenuse) - (leg * leg));

		System.out.println("The length of the other leg is: " + otherLeg);

		kbReader.close();
	}
}
