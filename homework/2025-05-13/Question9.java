import java.util.*;

public class Question9 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter the number you'd like to find the factors of");
		int number = input.nextInt();
		
		System.out.println("The factors of " + number + " are: ");
		
		// Q: Why is it enough to loop to n/2
		for (int i = 1; i <= number/2; i++) {
			if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        
        // Include the number itself too...
        System.out.println(number);
        
		input.close();
	}
}
