
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-10-15
 * Create and print square matrix n x n such that elements above minor diagonal
 * are equal to m, below minor diagonal are equal to n, and zeros.
 ************************************************
*/
import java.util.*;

public class HL_Lesson4_d {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter n (matrix size): ");
		int size = scanner.nextInt();

		System.out.print("Enter m: ");
		int m = scanner.nextInt();

		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		int[][] matrix = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i + j == size - 1) {
					matrix[i][j] = 0;
				} else if (i + j < size - 1) {
					matrix[i][j] = m;
				} else {
					matrix[i][j] = n;
				}
			}
		}

		for (int i = 0; i < size; i++) {
		    for (int j = 0; j < size; j++) {
		        System.out.print(matrix[i][j] + "\t");
		    }
		    System.out.println();
		}

		scanner.close();
	}
}
