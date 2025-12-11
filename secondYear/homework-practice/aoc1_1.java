import java.io.*;
import java.util.Scanner;

public class aoc1_1 {
	public static void main(String args[]) throws IOException {
		int curPos = 50;
		int zeroCounter = 0;

		Scanner fileScanner = new Scanner(new File("input.txt"));

		while (fileScanner.hasNext()) {
			String nextLine = fileScanner.nextLine();

			String direction = nextLine.substring(0, 1);
			int deltaPos = Integer.parseInt(nextLine.substring(1));

			if (direction.equals("L")) {
				curPos = turnLeft(curPos, deltaPos);
			} else if (direction.equals("R")) {
				curPos = turnRight(curPos, deltaPos);
			}

			if (curPos == 0) {
				zeroCounter++;
			}
		}

		System.out.println(zeroCounter);

		fileScanner.close();
	}

	public static int turnLeft(int curPos, int deltaPos) {
		int newPos = (curPos - deltaPos) % 100;
		if (newPos < 0) {
			newPos = 100 + newPos;
		}
		return newPos;
	}

	public static int turnRight(int curPos, int deltaPos) {
		int newPos = (curPos + deltaPos);
		if (newPos >= 100) {
			newPos = newPos % 100;
		}
		return newPos;
	}
}
