import java.util.*;

public class Question8 {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Please enter three integers");

		int a = kbReader.nextInt();
		int b = kbReader.nextInt();
		int c = kbReader.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("The maximum is" + a);
			} else {
				System.out.println("The maximum is" + c);
			}
		} else {
			if (b > c) {
				System.out.println("The maximum is" + b);
			} else {
				System.out.println("The maximum is" + c);
			}
		}
	}
}
