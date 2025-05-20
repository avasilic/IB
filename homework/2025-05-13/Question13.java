import java.util.*;

public class Question13 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nPlease enter the you'd like to find the divisors of");
		int divisor = input.nextInt();
		System.out.println("Please enter the lower bound of the range of divisors you'd like to print");
		int lowerBound = input.nextInt();
		System.out.println("Please enter the upper bound of the range of divisors you'd like to print");
		int upperBound = input.nextInt();
		
		int count = 0;
        int sum = 0;

        System.out.println("List of numbers between " + lowerBound + " and " + upperBound + " divisible by " + divisor);

        for (int i = lowerBound; i <= upperBound; i ++) {
            if (i % divisor == 0) {
            	System.out.print(i + " ");
	            count++;
	            sum += i;
            }
        }

        System.out.println("\n\nTotal count: " + count);
        System.out.println("Sum: " + sum);
        
        input.close(); 
	}
}
