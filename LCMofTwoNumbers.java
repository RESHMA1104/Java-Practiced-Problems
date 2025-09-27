import java.util.Scanner;
public class LCMofTwoNumbers {
    static int gcd(int a, int b){ // gcd of two numbers
        while(b!=0){
            int temp = b;
            b = a%b;
            temp = a;
        }
        return a;
    }
    public static void main(String[] args) { // LCM is the smallest positive integer that is divisible by both numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        int LCM = (a*b) / gcd(a, b); // LCM Formula = (a*b)/gcd(a, b)
        System.out.println("The LCM of two numbers " +a+ " and " +b+ " is " +LCM);
    }
}
