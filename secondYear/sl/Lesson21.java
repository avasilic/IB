import java.io.*;

/*
 * Author: Aleksandar Vasilić
 * Date: 2025-09-16
 * Question X: Writing to a file / reading from a file
 ************************************************
*/
public class Lesson21 {
	public static void main(String args[]) throws IOException {
		FileWriter fw = new FileWriter("testwrite.csib");
		PrintWriter output = new PrintWriter(fw);

		for (int i = 0; i < 10; i++) {
			int x = (int) (Math.random() * 51) + 50; // Inclusive
			output.println(x);
		}

		output.close();
		fw.close();
	}
}
