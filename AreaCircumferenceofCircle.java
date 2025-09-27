import java.util.*;
public class AreaCircumferenceofCircle{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        // Get input from user as radius 
        System.out.println("Enter radius : ");
        int radius = a.nextInt();
        double area = Math.PI * radius * radius; // Using Math.PI for accuracy
        double Circumference = 2 * Math.PI * radius;
        System.out.printf("Area of a circle : %.2f%n ",area); // here i print formatted output %.2f print only two numbers after decimals
        System.out.printf("Circumference of a circle : %.2f%n",Circumference);
    }
}