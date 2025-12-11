import java.io.*;
import java.util.Scanner;

public class aoc2_2 {
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
				int numDigits = numberOfDigits(j);

				boolean superFlag = false;

				// k = number of repetitions
				for (int k = 2; k <= numDigits && !superFlag; k++) {
					if (numDigits % k != 0)
						continue;
					if (!isPrime(k)) // very proud of this
						continue;

					int partLen = numDigits / k;
					long divisor = (long) Math.pow(10, partLen);

					long firstPart = j % divisor;

					boolean flag = true;
					long jCopy = j;

					// check each k part
					for (int p = 0; p < k && flag; p++) {
						long currentPart = jCopy % divisor;

						if (currentPart != firstPart) {
							flag = false;
						}

						jCopy /= divisor;
					}

					superFlag = flag;
				}

				if (superFlag) {
					invalidSum += j;
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

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
