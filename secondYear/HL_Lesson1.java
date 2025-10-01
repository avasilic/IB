
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * User enters number of rows and columns. Create and print 2D array such that
 * each element is equal to the sum of its indices.
 ************************************************
*/
import java.util.*;

public class HL_Lesson1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of rows for the 2D array");
		int rows = input.nextInt();

		System.out.println("Please enter the number of columns for the 2D array");
		int columns = input.nextInt();

		int[][] array2D = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array2D[i][j] = i + j;
			}
		}
		
		System.out.println("The 2D array is:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array2D[i][j] + "\t");
			}
			System.out.println();
		}

		input.close();
	}
}
