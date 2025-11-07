/*
 * Author: Aleksandar Vasilić
 * Date: 2025-10-15
 * Print 5x5 matrix with random two-digit numbers and calculate sum, average,
 * and max of elements below the minor diagonal.
 ************************************************
*/

public class HL_Lesson5_c {
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
        int count = 0;
        int max = 0;
        boolean firstElement = true;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j > 4) { // because below minor diagonal: row + column > size - 1
                    sum += matrix[i][j];
                    count++;
                    if (firstElement) {
                        max = matrix[i][j];
                        firstElement = false;
                    } else if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }
        }
        double avg = sum / (double)count;

        System.out.println("Below minor diagonal:");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
    }
}
