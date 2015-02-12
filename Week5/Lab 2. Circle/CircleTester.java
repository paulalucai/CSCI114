
/**
 * Utilizes the Circle class.
 * 
 * @author Paula Caixeta
 * @version 02/11/15
 */
import java.util.Scanner;

public class CircleTester {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = in.nextDouble();
        System.out.print("Enter color: ");
        String color = in.next();
        
        Circle myCircle = new Circle(radius, color);
        
        System.out.printf("\nFor the %s circle\n", myCircle.findColor());
        System.out.printf("Circumference is: %.2f\n", myCircle.findCircumference());
        System.out.printf("Area is: %.2f\n", myCircle.findArea());
        
    }
}
