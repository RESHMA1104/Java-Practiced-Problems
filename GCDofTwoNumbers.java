import java.util.Scanner;
public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        int gcd = 1; // because 1 is always a common divisor of any two numbers
        for(int i=1; i<=Math.min(num1, num2); i++){ // A divisor of both numbers should be min(num1, num2) --> Math.min(12, 18) --> i loop through 1 to 12.
            if(num1 % i == 0 && num2 % i == 0){ // num1 % i --> i divides num1 completely and num2 % i --> i divides num2 completely. If both are true, then i is a common divisor
                gcd = i; // Everytime we find i, we update gcd. Because looping from 1 --> up, last updated value will be the largest common divisor
            }
        }
        System.out.println("The GCD of " +num1+ " and " +num2+ " is " +gcd);
    }
}

/* 
import java.util.*;
public class GCDofTwoNumbers { // Here we use Eucledian Algorithm --> that replace bigger numbers until one num becomes zero
    static int gcd(int a, int b){
        while(b!=0){ // This runs until b becomes 0
            int temp = b; // a=48, b=18 --> temp = 18 
            b = a%b; // b = 48%18 --> 12 --> b = 12
            a = temp; // a = 18 
        }
        return a; // 18 --> if b becomes zero the loop ends and return a holds the gcd
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        int result = gcd(a, b);
        System.out.println("The GCD of two numbers " +a+ " and " +b+ " is " +result);
    }
}
*/