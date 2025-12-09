public class Lesson23 {
	public static void main(String args[]) {
		int m = 10;
		System.out.println(MyMethod.sumOfThree(m, 5, 35));

		int a = 100;
		int b = 100;
		int s = MyMethod.sumOfThree(a, b, 1000);
		System.out.println(s);

		System.out.println(MyMethod.avgOfThree(5, 50, 75));

		System.out.println(MyMethod.sum(10, 20));

		int w = 1;
		// The value of w won't be changed
		MyMethod.change(w);
		System.out.println(w);

		w = MyMethod.changeValue(w);
		System.out.println(w);

		String exampleChar = "*";
		int exampleRepetitions = 5;

		MyMethod.repeatLine(exampleRepetitions, exampleChar);

		System.out.println();

		MyMethod.repeatTriangle(exampleRepetitions, exampleChar);
	}
}

class MyMethod {
	public static int sumOfThree(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b) {
		return (a + b);
	}

	public static int sum(int a, int b, int c, int d) {
		return (a + b + c + d);
	}

	public static double avgOfThree(int a, int b, int c) {
		return sumOfThree(a, b, c) / 3.0;
	}

	public static void change(int k) {
		k = 100;
	}

	public static int changeValue(int k) {
		return (k + 100);
	}

	public static void repeatLine(int repetitions, String character) {
		for (int i = 0; i < repetitions; i++) {
			System.out.print(character);
		}
		System.out.println();
	}

	public static void repeatTriangle(int repetitions, String character) {
		for (int i = 0; i < repetitions; i++) {
			repeatLine(i + 1, character);
		}
	}
}
