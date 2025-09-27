import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        if(a > 0){
            System.out.println("The number is Positive");
        }
        else if(a == 0){
            System.out.println("The Number is Zero.");
        }
        else{
            System.out.println("The number is Negative");
        }
    }
}