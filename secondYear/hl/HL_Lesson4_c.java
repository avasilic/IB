
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-10-15
 * Create and print square matrix n x n such that elements above major diagonal
 * are equal to m, below major diagonal are equal to negative m, and zeros are
 * placed on the major diagonal.
 ************************************************
*/
import java.util.*;

public class HL_Lesson4_c {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter n (matrix size): ");
		int n = scanner.nextInt();

		System.out.print("Enter m: ");
		int m = scanner.nextInt();

		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					matrix[i][j] = 0;
				} else if (i < j) {
					matrix[i][j] = m;
				} else {
					matrix[i][j] = -m;
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
