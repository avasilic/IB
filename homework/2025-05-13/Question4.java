import java.util.*;

public class Question4{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("\nPlease enter the first positive interger you'd like to be printed");
		int number = input.nextInt();
		int count = 0;
		
		for (int i = number; i >= 1; i--) {
			System.out.print(i + "\t");
			count++;
			if (count % 10 == 0) {
				System.out.print("\n");
			}
		}
		
		// Additional request ???

		input.close();
	}
}
