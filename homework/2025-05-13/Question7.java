import java.util.*;

public class Question7 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter the lower bound of the range you'd like to print");
		int lowerBound = input.nextInt();
		System.out.println("Please enter the upper bound of the range you'd like to print");
		int upperBound = input.nextInt();
		
		int sum = 0;
		
		for (int i = lowerBound; i <= upperBound; i++) {
			sum += i;
        }
        
        System.out.println("Sum: " + sum);
        
		input.close();
	}
}
