import java.util.*;

public class Question15 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the word you'd like to check is a palindrome:");
		String word = input.nextLine();

		String reversedWord = "";

		for (int i = word.length(); i >= 1; i--) {
			reversedWord += word.charAt(i - 1);
		}
		
		if (word.equalsIgnoreCase(reversedWord)) {
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}

		input.close();
	}
}
