import java.util.*;

public class Question8 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter the number you'd like to find the factorial of");
		int number = input.nextInt();
		
		int sum = 1;
		
		for (int i = 1; i <= number; i++) {
			sum *= i;
        }
        
        System.out.println(number + "!: " + sum);
        
		input.close();
	}
}
