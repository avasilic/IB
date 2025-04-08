import java.util.Scanner;

public class Initials {
	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in);
		
		System.out.println("Please enter your full name");
		String fullNameCleaned = kbReader.nextLine().trim();
		// We need to handle something like " Aleksandar Vasilic ",
		// we know there will be one space before the surname
		char firstInitial = fullNameCleaned.charAt(0);
		char lastInitial = fullNameCleaned.charAt(fullNameCleaned.lastIndexOf(" ") + 1);

		System.out.println("Your initials are " + firstInitial + "." + lastInitial + ".");
	}
}