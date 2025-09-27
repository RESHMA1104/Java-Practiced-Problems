import java.util.Scanner;
public class MinofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int Minimum = (a<b) ? a : b; // Ternary Operator
        //int Minimum = Math.min(a, b); // Method in java
        System.out.println("The Minimum of two numbers is "+Minimum);
    }
}