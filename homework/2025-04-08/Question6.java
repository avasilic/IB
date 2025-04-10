import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);

        // Q6: After the user enters the radius of a circle produce the
        // following output: "RADIUS= ..., AREA=..., PERIMETER=..."

        System.out.println("Please enter the radius of a circle");
        double radius = kbReader.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("RADIUS= " + radius + ", AREA= " + area + ", PERIMETER= " + perimeter);
        
        kbReader.close();
    }
}
