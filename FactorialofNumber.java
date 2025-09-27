import java.util.Scanner;
public class FactorialofNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        long fact = 1; // because factorial goes faster
        for(int i=1; i<=a; i++){
            fact*=i;
        }
        System.out.println("The Factorial of a number "+a+ " is "+fact);
    }
}