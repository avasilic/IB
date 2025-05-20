import java.util.*;

public class Question16 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the word you'd like to check is a palindrome:");
		String sentence = input.nextLine().replace(" ", "");

		String reversedSentence = "";

		for (int i = sentence.length(); i >= 1; i--) {
			reversedSentence += sentence.charAt(i - 1);
		}
		
		if (sentence.equalsIgnoreCase(reversedSentence)) {
			System.out.println(sentence + " is a palindrome");
		} else {
			System.out.println(sentence + " is not a palindrome");
		}

		input.close();
	}
}
