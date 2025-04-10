import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        // Q5: The lengths of two sides of a rectangle are entered by the user.
        // Print the area and the perimeter.

        System.out.println("Please enter the lengths of two sides of a rectangle");

        double side1 = kbReader.nextDouble();
        double side2 = kbReader.nextDouble();

        // Perimeter
        System.out.println("The perimeter is " + 2*(side1 + side2));
        // Area
        System.out.println("The area is " + (side1 * side2));

        kbReader.close();
    }
}
