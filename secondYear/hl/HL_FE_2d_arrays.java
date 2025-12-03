
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

		int[][] matrixC = {
		    { 4, 7 },
		    { 2, 6 }
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

		int detC = determinant(matrixC);
		System.out.println("\nDeterminant of Matrix C: " + detC);
		
		double[][] inverseC = findInverse(matrixC);
		System.out.println("\nInverse of Matrix C:");
		for (int i = 0; i < inverseC.length; i++) {
		    for (int j = 0; j < inverseC[0].length; j++) {
		        System.out.printf("%.4f\t", inverseC[i][j]);
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

	static int determinant(int[][] matrix) {
    int n = matrix.length;

    // 1x1 matrix
    if (n == 1) {
        return matrix[0][0];
    }

    // 2x2 matrix
    if (n == 2) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // nxn matrix using cofactor expansion along first row
    int det = 0;
    for (int j = 0; j < n; j++) {
        det += matrix[0][j] * cofactor(matrix, 0, j);
    }
    return det;
}

static int cofactor(int[][] matrix, int row, int col) {
    int[][] minor = getMinor(matrix, row, col);
    int sign = ((row + col) % 2 == 0) ? 1 : -1;
    return sign * determinant(minor);
}

static int[][] getMinor(int[][] matrix, int excludeRow, int excludeCol) {
    int n = matrix.length;
    int[][] minor = new int[n - 1][n - 1];
    int minorRow = 0;

    for (int i = 0; i < n; i++) {
        if (i == excludeRow) continue;
        int minorCol = 0;
        for (int j = 0; j < n; j++) {
            if (j == excludeCol) continue;
            minor[minorRow][minorCol] = matrix[i][j];
            minorCol++;
        }
        minorRow++;
    }
    return minor;
}

static double[][] findInverse(int[][] matrix) {
    int n = matrix.length;
    int det = determinant(matrix);

    // Matrix is not invertible if determinant is zero
    if (det == 0) {
        System.out.println("Matrix is singular (determinant = 0), inverse does not exist");
        return null;
    }

    double[][] inverse = new double[n][n];

    // Special case: 2x2 matrix
    if (n == 2) {
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }

    // General case: adjugate matrix method
    // Inverse = (1/det) * adjugate matrix
    // Adjugate = transpose of cofactor matrix
    // Mathematics LibreTexts: https://math.libretexts.org/Bookshelves/Linear_Algebra/Linear_Algebra_with_Applications_(Nicholson)/03:_Determinants_and_Diagonalization/3.02:_Determinants_and_Matrix_Inverses
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            // Note: adjugate is transpose, so we swap i and j
            inverse[j][i] = cofactor(matrix, i, j) / (double) det;
        }
    }

    return inverse;
}
}
