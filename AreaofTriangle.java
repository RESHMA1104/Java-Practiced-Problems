/*  For base and height
import java.util.Scanner;
public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of a triangle : ");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle : ");
        double height = sc.nextDouble();
        // Formula : 1/2 * base * height
        double Area = 0.5 * base * height;
        System.out.println("Area of triangle : "+Area);
    }
}
*/ 

// Area of triangle - if three sides are given use Heron’s Formula for 3 sides
import java.util.*;
public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side");
        double a = sc.nextDouble();
        System.out.println("Enter the second side");
        double b = sc.nextDouble();
        System.out.println("Enter the third side");
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double Area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle : "+Area);
    }
}