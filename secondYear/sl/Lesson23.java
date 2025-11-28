public class Lesson23 {
	public static void main(String args[]) {
		int m = 10;
		System.out.println(MyMethod.sum(m, 5, 35));

		int a = 100;
		int b = 100;
		int s = MyMethod.sum(a, b, 1000);
		System.out.println(s);
	}
}

class MyMethod {
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
