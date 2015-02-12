
/**
 * Lab 2. Circles - CSCI 114, online class
 * 
 * @author Paula Caixeta
 * @version 02/11/15
 */
import java.lang.Math;

public class Circle {
    // variable constant value for Pi
    public static final double PI = 3.1415926;
    
    // instance variables
    private String color;
    private double radius;
   
    // constructs a Circle object
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }
   
    // returns the color input of the Circle object
    public String findColor() {
        return color;
    }
    
    // uses the radius input to calculate circumference of the Circle
    public double findCircumference() {
        double circ = 2 * PI * radius; // formula 2*pi*r
        return circ;
    }
   
    // uses the radius input to calculate the area of the Circle
    public double findArea() {
        double area = PI * (Math.pow(radius, 2)); // formula: pi*(r**2)
        return area;
    }
       
}
