import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        // Q4: The user enters the lengths of two legs of the right-angled
        // triangle. a) Find and print the value of the hypothenuse. b) Print
        // the values of the tangent for both acute angles. c) Find and print
        // the values of both acute angles in degrees.
        System.out.println("Please enter the lengths of two legs of the right-angled triangle");

        double leg1 = kbReader.nextDouble();
        double leg2 = kbReader.nextDouble();

        // a) We use a^2+b^2=c^2
        System.out.println("The hypothenuse is " + Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2)));
        /*
         * Tested cases:
         * a=3, b=4. Expected: 5. Actual: 5 ✓
         * a=5, b=12. Expected: 13. Actual: 13 ✓
         * a=4.5 b=3.3333333. Expected: 5.6 Actual: 5.6... ✓
         */

        // b) Calculate and print the tangents of both acute angles
        double tangentAngle1 = leg2 / leg1; // tan(angle1) = opposite/adjacent
        double tangentAngle2 = leg1 / leg2; // tan(angle2) = opposite/adjacent
        System.out.println("The tangent of the first acute angle is: " + tangentAngle1);
        System.out.println("The tangent of the second acute angle is: " + tangentAngle2);

        // c) Calculate and print both acute angles in degrees
        double angle1Degrees = Math.toDegrees(Math.atan(tangentAngle1));
        double angle2Degrees = Math.toDegrees(Math.atan(tangentAngle2));
        System.out.println("The first acute angle is: " + angle1Degrees + " degrees");
        System.out.println("The second acute angle is: " + angle2Degrees + " degrees");

        /*
         * Tested cases:
         * 1. 3 and 4 ✓
         * Expected outputs:
         * - Hypotenuse: 5
         * - Tangent of first angle: 4/3 = 1.33
         * - Tangent of second angle: 3/4 = 0.75
         * - First angle: about 53.13 degrees
         * - Second angle: about 36.87 degrees
         * 
         * 2. 1 and 1 ✓
         * Expected outputs:
         * - Hypotenuse: sqrt(2) ≈ 1.414
         * - Tangent of first angle: 1/1 = 1
         * - Tangent of second angle: 1/1 = 1
         * - First angle: 45 degrees
         * - Second angle: 45 degrees
         * 
         * 3. 5 and 12 ✓
         * Expected outputs:
         * - Hypotenuse: 13
         * - Tangent of first angle: 12/5 = 2.4
         * - Tangent of second angle: 5/12 ≈ 0.417
         * - First angle: about 67.38 degrees
         * - Second angle: about 22.62 degrees
         * 
         * 4. 2.5 and 6.0 ✓
         * Expected outputs:
         * - Hypotenuse: sqrt(2.5² + 6.0²) ≈ 6.5
         * - Tangent of first angle: 6.0/2.5 = 2.4
         * - Tangent of second angle: 2.5/6.0 ≈ 0.417
         * - First angle: about 67.38 degrees
         * - Second angle: about 22.62 degrees
         */
    }
}
