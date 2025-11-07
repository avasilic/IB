/*
 * Author: Aleksandar Vasilić
 * Date: 2025-10-15
 * Print 5x5 matrix with random two-digit numbers and calculate sum, average, 
 * and max of elements on the major diagonal.
 ************************************************
*/

public class HL_Lesson5_a {
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
        int max = matrix[0][0];
        for (int k = 0; k < 5; k++) {
            sum += matrix[k][k];
            if (matrix[k][k] > max) {
                max = matrix[k][k];
            }
        }
        double avg = sum / 5.0;
        
        System.out.println("Major diagonal:");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
    }
}