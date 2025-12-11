import java.io.*;
import java.util.Scanner;

public class aoc1_2 {
	public static void main(String args[]) throws IOException {
		int curPos = 50;
		int zeroCounter = 0;

		Scanner fileScanner = new Scanner(new File("input.txt"));

		while (fileScanner.hasNext()) {
			String nextLine = fileScanner.nextLine();

			String direction = nextLine.substring(0, 1);
			int deltaPos = Integer.parseInt(nextLine.substring(1));

			if (direction.equals("L")) {
				int[] result = turnLeft(curPos, deltaPos);
				curPos = result[0];
				zeroCounter += result[1];
			} else if (direction.equals("R")) {
				int[] result = turnRight(curPos, deltaPos);
				curPos = result[0];
				zeroCounter += result[1];
			}
		}

		System.out.println(zeroCounter);

		fileScanner.close();
	}

	public static int[] turnLeft(int curPos, int deltaPos) {
		int newPos = (curPos - deltaPos) % 100;
		if (newPos < 0) {
			newPos = 100 + newPos;
		}

		int passedZero;
		if (curPos == 0) {
			passedZero = deltaPos / 100;
		} else {
			passedZero = (deltaPos - curPos + 100) / 100;
		}

		return new int[] { newPos, passedZero };
	}

	public static int[] turnRight(int curPos, int deltaPos) {
		int passedZero = (curPos + deltaPos) / 100;
		int newPos = (curPos + deltaPos);
		if (newPos >= 100) {
			newPos = newPos % 100;
		}

		return new int[] { newPos, passedZero };
	}
}
