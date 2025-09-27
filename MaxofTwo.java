import java.util.Scanner;
public class MaxofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        int Maximum = (a>b) ? a : b; // Ternary Operator
        //int Maximum = Math.max(a, b); // Method in java
        System.out.println("The Maximum of two numbers is "+Maximum);
    }
}
