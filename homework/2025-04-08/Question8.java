import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        // Q7: The coefficients a, b, and c of the quadratic equation
        // ax^2 + bx + c = 0 are entered from the keyboard. Calculate
        // and print the solutions. Test your program with several
        // values fpr a, b, and c: [1,-5,6], [2,12,18],[1,5,7]. What
        // can you notice?

        System.out.println("Please enter the values for the quadratic function ax^2 + bx + c");
        System.out.print("a=");
        double a = kbReader.nextDouble();
        System.out.print("b=");
        double b = kbReader.nextDouble();
        System.out.print("c=");
        double c = kbReader.nextDouble();

        // Discriminant
        double discriminant = b * b - 4 * a * c;

        // Solutions
        double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Solutions:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        // I noticed that with the last example, [1,5,7], there are no
        // real roots so NaN is outputted.

        kbReader.close();
    }
}
