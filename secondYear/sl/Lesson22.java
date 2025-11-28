import java.io.*;
import java.util.Scanner;

/*
 * Author: Aleksandar Vasilić
 * Date: 2025-11-07
 * Question X: Reading from a file
 ************************************************
*/
public class Lesson22 {
	public static void main(String args[]) throws IOException {
		Scanner fileScanner = new Scanner(new File("testwrite.csib"));
		String txtLines[] = new String[1000];
		int noLines = 0;

		while (fileScanner.hasNext()) {
			txtLines[noLines] = fileScanner.nextLine();
			noLines++;
		}
		fileScanner.close();

		for (int j = 0; j < noLines; j++) {
			System.out.println(txtLines[j]);
		}
	}
}
