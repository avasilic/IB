
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-10-15
 * Elements of the matrix 3x4 are entered by the user. Find the largest one.
 ************************************************
*/
import java.util.*;

public class HL_Lesson3 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the elements of the matrix 3x4:");

		int[][] matrix = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("Element [" + i + "][" + j + "]: ");
				matrix[i][j] = input.nextInt();
			}
		}

		int largest = matrix[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (matrix[i][j] > largest) {
					largest = matrix[i][j];
				}
			}
		}

		input.close();
	}
}
