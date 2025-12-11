import java.io.*;
import java.util.Scanner;

public class aoc2_1 {
	public static void main(String args[]) throws IOException {
		Scanner fileScanner = new Scanner(new File("input2.txt"));
		String input = fileScanner.nextLine();

		long invalidSum = 0;

		String[] ids = input.split(",");

		// Go through each ID
		for (int i = 0; i < ids.length; i++) {
			// split by -
			long lowerBound = Long.parseLong(ids[i].split("-")[0]);
			long upperBound = Long.parseLong(ids[i].split("-")[1]);

			// for lower to upper
			for (long j = lowerBound; j <= upperBound; j++) {
				// check if number of digits is even
				int numDigits = numberOfDigits(j);

				if (numDigits % 2 == 0) {
					if ((j / (long) Math.pow(10, numDigits / 2)) == (j % (long) Math.pow(10, numDigits / 2))) {
						System.out.println("HIT");
						invalidSum += j;
					}
				}
			}
		}

		System.out.println(invalidSum);

		fileScanner.close();
	}

	public static int numberOfDigits(long n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			++count;
		}
		return count;
	}
}
