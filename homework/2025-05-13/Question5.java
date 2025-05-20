import java.util.*;

public class Question5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		// I assume you want us to use loops
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        
        System.out.println("Sum: " + sum);

        // Or the non-dumb way:
        int smartSum = 100 * (100 + 1) / 2;
        System.out.println("Smart sum: " + smartSum);
        
		input.close();
	}
}
