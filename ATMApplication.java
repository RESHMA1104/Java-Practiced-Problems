import java.util.*;
public class ATMApplication {
    private static double Balance = 1000.00;
    public static void main(String[] args) {
        System.out.println("Welcome to ATM!");
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Deposit : Press 1");
            System.out.println("Withdrawal : Press 2");
            System.out.println("Check Balance : Press 3");
            System.out.println("Exit Press 4");
            n = sc.nextInt();
            switch (n) {
                case 1:
                Deposit(sc);
                break;
                case 2:
                Withdraw(sc);
                break;
                case 3:
                CheckBalance();
                break;
                case 4:
                System.out.println("Thank you for using ATM!");
                default:
                System.out.println("Invalid choice");
                break;
            }
        }
        while (n!=4);
        sc.close();
    }
    private static void CheckBalance(){
        System.out.println("Current Balance is Rs."+Balance);
    }
    private static void Deposit(Scanner sc){
        System.out.println("Deposit Amount");
        double Amount = sc.nextDouble();
        if(Amount > 0){
            Balance += Amount;
            System.out.println("Rs."+Amount+" Deposited Successfully");
            CheckBalance();
        }
        else{
            System.out.println("Invalid deposit Amount.");
        }
    }
    private static void Withdraw(Scanner sc){
        System.out.println("Enter Amount for Withdrawal : ");
        double Amount = sc.nextDouble();
        if(Amount > 0 && Amount <= Balance){
            Balance -= Amount;
            System.out.println("Rs."+Amount+" Withdrawed Successfully");
            CheckBalance();
        }
        else if(Amount > Balance){
            System.out.println("Invalid Balance");
        }
        else{
            System.out.println("Invalid Withdrawal Transaction");
        }
    }
}