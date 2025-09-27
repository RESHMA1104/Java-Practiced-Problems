import java.util.Scanner;
public class GreatestAmongTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("Num1 is greater than num2");
        }
        else{
            System.out.println("Num2 is greater");
        }
    }
}