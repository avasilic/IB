
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question 14: Create an array of 100 elements such that the first one is 1, second is 2, then 3,4 etc. Print all elements. Use only one for loop
 ************************************************
*/
public class Lesson14 {
	public static void main(String args[]) {
		int[] numbers = new int[100];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}
	}
}
