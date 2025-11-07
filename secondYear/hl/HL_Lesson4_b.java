
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-10-15
 * Create and print square matrix n x n such that value m2 is placed on the
 * minor diagonal and all other values are 0.
 ************************************************
*/
import java.util.*;

public class HL_Lesson4_b {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter n (matrix size): ");
		int n = scanner.nextInt();

		System.out.print("Enter m: ");
		int m = scanner.nextInt();

		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1) {
					matrix[i][j] = m * m;
				} else {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

		scanner.close();
	}
}
