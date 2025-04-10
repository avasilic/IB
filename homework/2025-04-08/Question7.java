import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        // Q7: The equation of a quadratic function f(x)=ax^2 + bx + c
        // is given by entering the coefficients a, b, and c. Calculate
        // and print the value of the function f(x) for different
        // x-values.

        System.out.println("Please enter the values for the quadratic function ax^2 + bx + c");
        System.out.print("a=");
        double a = kbReader.nextDouble();
        System.out.print("b=");
        double b = kbReader.nextDouble();
        System.out.print("c=");
        double c = kbReader.nextDouble();

        System.out.println("What x would you like to use?");
        System.out.print("x=");
        double x = kbReader.nextDouble();

        System.out.println("The equation is f(x) = " + (a * Math.pow(x, 2) + b * x + c));
        
        kbReader.close();
    }
}
