/*
 * Author: Aleksandar Vasilić
 * Date: 2025-10-15
 * Print 5x5 matrix with random two-digit numbers and calculate sum, average,
 * and max of elements on the minor diagonal.
 ************************************************
*/

public class HL_Lesson5_b {
    public static void main(String args[]) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = (int)(Math.random() * 90 + 10);
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        int sum = 0;
        int max = matrix[0][4];
        for (int k = 0; k < 5; k++) {
            sum += matrix[k][5-k-1]; // because minor diagonal: column = size - row - 1
            if (matrix[k][5-k-1] > max) {
                max = matrix[k][5-k-1];
            }
        }
        double avg = sum / 5.0;

        System.out.println("Minor diagonal:");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
    }
}
