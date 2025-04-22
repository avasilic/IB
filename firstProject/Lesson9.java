import java.io.*;
import java.util.*;

public class Lesson9 {
	public static void main(String args[]) {
		// Q1. Create a program where a user enters his/her age and the code prints
		// whether they are adult or not
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter your age"); // No limit so technically you
		// can enter negative numbers
		int age = kbReader.nextInt();
		if (age < 18) {
			System.out.println("You are " + age + " years old. This means you are not an adult yet.");
		} else {
			System.out.println("You are " + age + " years old. This means you are an adult.");
		}
		kbReader.close();

		// Q2. For particular test with max.score of 90 marks user enters
		// his/her score. Produce an appropriate message:“PASS” if result is at
		// least 65%, otherwise “FAIL”.
		Scanner kbReader2 = new Scanner(System.in);
		System.out.println("Enter your score"); // no limit so technically you can type more than 90
		int score = kbReader2.nextInt();
		double boundary = 90 * 0.65; // 58.5 or more
		if (score < boundary) {
			System.out.println("You FAILED :(");
		}
		kbReader2.close();
	}
};
