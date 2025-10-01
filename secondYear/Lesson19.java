import java.util.*;

/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 12: Two arrays, each of 10 real numbers are entered by the user.
 * Program should create and print the new one of the same size such that each
 * element is obtained as the sum of corresponding elements from the first
 * two arrays (i.e. the same indices)
 ************************************************
*/
public class Lesson19 {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);

		double[] firstIntegerArray = new double[10];
		// "Please use a seperate for loop for each of the two arrays" - prof.
		for (int i = 0; i < firstIntegerArray.length; i++) {
			System.out.print("First set of numbers: enter element " + (i + 1) + ": ");
			firstIntegerArray[i] = kbReader.nextInt();
		}

		double[] secondIntegerArray = new double[10];
		for (int i = 0; i < secondIntegerArray.length; i++) {
			System.out.print("Second set of numbers: enter element " + (i + 1) + ": ");
			secondIntegerArray[i] = kbReader.nextInt();
		}

		double[] sumArray = new double[10];
		for (int i = 0; i < sumArray.length; i++) {
			sumArray[i] = firstIntegerArray[i] + secondIntegerArray[i];
		}

		System.out.println("Array containing the sums of corresponding elements:");
		for (int i = 0; i < sumArray.length; i++) {
			System.out.print(sumArray[i] + " ");
		}

		kbReader.close();
	}
}
