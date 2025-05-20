import java.util.*;

public class Question14 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the string you'd like to reverse:");
		String word = input.nextLine();
        
		for (int i = word.length(); i >= 1; i--) {
			System.out.print(word.charAt(i - 1));
		}
		
        input.close(); 
	}
}
