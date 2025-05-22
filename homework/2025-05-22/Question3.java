public class Question3 {
	public static void main(String args[]) {
		int count = 0;
		int sum = 0;

		// Hundreds digit can go from 1 to 7 since if we go to 8 then the
		// next will be 9 and the one after that will be 10
		for (int hundreds = 1; hundreds <= 7; hundreds++) {
			for (int tens = hundreds + 1; tens <= 8; tens++) {
				for (int ones = tens + 1; ones <= 9; ones++) {
					int number = hundreds * 100 + tens * 10 + ones;
					System.out.println(number);
					count++;
					sum += number;
				}
			}
		}

		System.out.println("Count: " + count);
		System.out.println("Sum: " + sum);

		// With only one for loop
		/*
		 * int count = 0;
		 * int sum = 0;
		 * 
		 * for (int num = 100; num <= 999; num++) {
		 * int hundreds = num / 100;
		 * int tens = (num / 10) % 10;
		 * int ones = num % 10;
		 * 
		 * if (hundreds < tens && tens < ones) {
		 * System.out.println(num);
		 * count++;
		 * sum += num;
		 * }
		 * }
		 * 
		 * System.out.println("Count: " + count);
		 * System.out.println("Sum: " + sum);
		 */
	}
}
