
/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-11
 * Question 12.2
 ************************************************
*/
import java.util.*;

public class Lesson12_2 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		String option;
		boolean exitProgram = false;
		boolean exitOption = false;
		boolean exitSubOption = false;

		do {
			exitOption = false;
			System.out.println("===Main Menu===");
			System.out.println("1. Option 1 ✫");
			System.out.println("2. Option 2");
			System.out.println("3. Option 3");
			System.out.println("0. Exit");

			option = input.nextLine().trim();

			switch (option) {
				case "0": {
					System.out.println("Goodbye...");
					exitProgram = true;
					exitOption = true;
					break;
				}
				case "1": {
					do {
						exitSubOption = false;
						System.out.println("=====Option 1 Menu=====");
						System.out.println("A. Option 1");
						System.out.println("B. Option 2");
						System.out.println("R. Return to previous");
						System.out.println("E. Exit");

						option = input.nextLine().trim();

						switch (option) {
							case "E": {
								System.out.println("Goodbye...");
								exitProgram = true;
								exitOption = true;
								exitSubOption = true;
								break;
							}
							case "R": {
								exitOption = true;
								break;
							}
							case "A": {
								do {
									System.out.println("=======Option 1.1 Menu=======");
									System.out.println("A. Option 1");
									System.out.println("B. Option 2");
									System.out.println("R. Return to previous");
									System.out.println("E. Exit");

									option = input.nextLine().trim();

									switch (option) {
										case "E": {
											System.out.println("Goodbye...");
											exitProgram = true;
											exitOption = true;
											exitSubOption = true;
											break;
										}
										case "R": {
											System.out.println("Goodbye...");
											exitSubOption = true;
											break;
										}
										case "A": {
											System.out.println("Option 1 is executed");
											break;
										}
										case "B": {
											System.out.println("Option 2 is executed");
											break;
										}
										default: {
											System.out.println("Invalid option '" + option + "' selected. Try again");
										}
									}
								} while (!exitSubOption);
								break;
							}
							case "B": {
								do {
									System.out.println("=======Option 1.2 Menu=======");
									System.out.println("A. Option 1");
									System.out.println("B. Option 2");
									System.out.println("R. Return to previous");
									System.out.println("E. Exit");

									option = input.nextLine().trim();

									switch (option) {
										case "E": {
											System.out.println("Goodbye...");
											exitProgram = true;
											exitOption = true;
											exitSubOption = true;
											break;
										}
										case "R": {
											exitSubOption = true;
											break;
										}
										case "A": {
											System.out.println("Option 1 is executed");
											break;
										}
										case "B": {
											System.out.println("Option 2 is executed");
											break;
										}
										default: {
											System.out.println("Invalid option '" + option + "' selected. Try again");
										}
									}
								} while (!exitSubOption);
								break;
							}
							default: {
								System.out.println("Invalid option '" + option + "' selected. Try again");
							}
						}
					} while (!exitOption);
					break;
				}
				case "2": {
					do {
						System.out.println("===Option 2 Menu===");
						System.out.println("A. Option 1");
						System.out.println("B. Option 2");
						System.out.println("R. Return to previous");
						System.out.println("E. Exit");

						option = input.nextLine().trim();

						switch (option) {
							case "E": {
								System.out.println("Goodbye...");
								exitProgram = true;
								exitOption = true;
								break;
							}
							case "R": {
								exitOption = true;
								break;
							}
							case "A": {
								System.out.println("Option 2.1 is executed");
								break;
							}
							case "B": {
								System.out.println("Option 2.2 is executed");
								break;
							}
							default: {
								System.out.println("Invalid option '" + option + "' selected. Try again");
							}
						}
					} while (!exitOption);
					break;
				}
				case "3": {
					do {
						System.out.println("===Option 3 Menu===");
						System.out.println("A. Option 1");
						System.out.println("B. Option 2");
						System.out.println("R. Return to previous");
						System.out.println("E. Exit");

						option = input.nextLine().trim();

						switch (option) {
							case "E": {
								System.out.println("Goodbye...");
								exitProgram = true;
								exitOption = true;
								break;
							}
							case "R": {
								exitOption = true;
								break;
							}
							case "A": {
								System.out.println("Option 3.1 is executed");
								break;
							}
							case "B": {
								System.out.println("Option 3.2 is executed");
								break;
							}
							default: {
								System.out.println("Invalid option '" + option + "' selected. Try again");
							}
						}
					} while (!exitOption);
					break;
				}
				default: {
					System.out.println("Invalid option '" + option + "' selected. Try again");
				}
			}
		} while (!exitProgram || !exitOption || !exitSubOption);

		input.close();
	}
}
