import java.util.*;

public class Question10 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter the number you'd like to check is prime:");
		int number = input.nextInt();
		
		// A number is prime if it's only divisible by 1 and itself
		boolean isPrime = true;
		if (number <= 1) {
            isPrime = false;
		} else {
			// Also is sqrt(n) better than checing with n?
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
	        }
		}
        
        if (isPrime) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
        
		input.close();
	}
}
