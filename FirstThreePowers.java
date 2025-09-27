import java.util.Scanner;
public class FirstThreePowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int N = sc.nextInt();
        /* 
        int Power1 = N;
        int Power2 = N * N;
        int Power3 = N * N * N;
        */
        int Power1 = (int)Math.pow(N, 1); // Math.pow(N, 1) --> It is a built in java method. The return type of this method is double 0.5
        int Power2 = (int)Math.pow(N, 2); // So, Here It is type casted from double to int --> (int)Math.pow(N, 1)
        int Power3 = (int)Math.pow(N, 3);
        System.out.println("N^1 is "+Power1);
        System.out.println("N^2 is "+Power2);
        System.out.println("N^3 is "+Power3);
    }
}