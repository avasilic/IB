
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-02
 * Matrix manipulation
 ************************************************
*/

public class HL_FE_2d_arrays {
	public static void main(String args[]) {
		// Lets define two matricies just for example

		int[][] matrixA = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};

		int[][] matrixB = {
				{ 9, 8, 7 },
				{ 6, 5, 4 },
				{ 3, 2, 1 }
		};

		int[][] sumMatrix = addMatrices(matrixA, matrixB);

		System.out.println("Sum of Matrix A and Matrix B is:");
		for (int i = 0; i < sumMatrix.length; i++) {
			for (int j = 0; j < sumMatrix[0].length; j++) {
				System.out.print(sumMatrix[i][j] + "\t");
			}
			System.out.println();
		}

		int[][] diffMatrix = subtractionMatrices(matrixA, matrixB);
		System.out.println("Difference of Matrix A and Matrix B is:");
		for (int i = 0; i < diffMatrix.length; i++) {
			for (int j = 0; j < diffMatrix[0].length; j++) {
				System.out.print(diffMatrix[i][j] + "\t");

			}
			System.out.println();
		}

		int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
		System.out.println("Product of Matrix A and Matrix B is:");
		for (int i = 0; i < productMatrix.length; i++) {
			for (int j = 0; j < productMatrix[0].length; j++) {
				System.out.print(productMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static int[][] addMatrices(int[][] a, int[][] b) {
		int rows = a.length;
		int cols = a[0].length;
		int[][] result = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}

		return result;
	}

	static int[][] subtractionMatrices(int[][] a, int[][] b) {
		int rows = a.length;
		int cols = a[0].length;
		int[][] result = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}

		return result;
	}

	static int[][] multiplyMatrices(int[][] a, int[][] b) {
		int rowsA = a.length;
		int colsA = a[0].length;
		int colsB = b[0].length;
		int[][] result = new int[rowsA][colsB];

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return result;
	}
}
