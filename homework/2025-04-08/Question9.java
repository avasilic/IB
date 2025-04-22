import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        // Q9: The coordinates of two points are given using keyboard
        // input: A(x1, x2) and B(x2, y2). Calculate the distance
        // between them, the gradient (slope) of the segment [AB] and
        // the coordinates of the midpoint M.

        System.out.println("Please enter the values for the first point, A");
        System.out.print("x1=");
        double x1 = kbReader.nextDouble();
        System.out.print("y1=");
        double y1 = kbReader.nextDouble();
        
        System.out.println("Please enter the values for the second point, B");
        System.out.print("x2=");
        double x2 = kbReader.nextDouble();
        System.out.print("y2=");
        double y2 = kbReader.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        double gradient = (y2-y1) / (x2-x1);
        double midpointX = (x1 + x2) / 2;
        double midpointY = (y1 + y2) / 2;
        
        System.out.println("The distance is: " + distance);
        System.out.println("The gradient is: " + gradient);
        System.out.println("The midpoint is: (" + midpointX + "," + midpointY + ")");
        
        kbReader.close();
    }
}
