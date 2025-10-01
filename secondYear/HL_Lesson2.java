
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * User enters number n. Create and print filled up square matrix 5x5 with
 * random values between 0 and n (inclusively).
 ************************************************
*/
import java.util.*;

public class HL_Lesson2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number n (upper limit for random numbers)");
		int n = input.nextInt();

		int[][] matrix = new int[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = (int) (Math.random() * (n + 1));
			}
		}

		System.out.println("The 5x5 matrix is:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		input.close();
	}
}
