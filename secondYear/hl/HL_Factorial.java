
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-12-03
 * Factorials
 ************************************************
*/

public class HL_Factorial {
	public static void main(String[] args) {
		int n = 5;
		factorialIterative(n);
		factorialRecursive(n);
	}

	// Iterative method (without recursion)
	public static int factorialIterative(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		System.out.println("Iterative factorial of " + n + " is " + result);
		return result;
	}

	// Recursive method
	public static int factorialRecursive(int n) {
		if (n == 0 || n == 1) {
			System.out.println("Recursive factorial of " + n + " is 1");
			return 1;
		}
		int result = n * factorialRecursive(n - 1);
		if (n == 2) { // Print only once at the end of recursion
			System.out.println("Recursive factorial of " + (n + 1) + " is " + result * (n + 1));
		}
		return result;
	}
}
