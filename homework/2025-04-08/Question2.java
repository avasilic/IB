import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in);
		
		// Q2: The equation of the straight line y = kx + n is given by entering
		// coefficients k and n (real numbers). For an entered x, print the
		// corresponding y value. Use nextDouble()
		System.out.println("Please enter the coefficients k and n for the equation of the line y=kx+n");
		Double k = kbReader.nextDouble();
		Double n = kbReader.nextDouble();
		System.out.println("Please enter the x value for the line:");
		Double x = kbReader.nextDouble();
		System.out.println("y = " + (k * x + n));
		
		kbReader.close();
	}
}
