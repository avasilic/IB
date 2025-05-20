import java.util.*;

public class Question6 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter number you'd like us to sum up to");
		int number = input.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			sum += i;
			if (i < number) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
			}
        }
        
        System.out.println(" = " + sum);
        
		input.close();
	}
}
