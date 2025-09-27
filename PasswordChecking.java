import java.util.*;
public class PasswordChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SettedPassword = "123456";
        int count = 3;
        while(true){
            System.out.println("Enter password : ");
            String password = sc.nextLine();
            if(password.equals(SettedPassword)){
                System.out.println("Welcome");
                break;
            }
            else{
                if(count == 1){
                    System.out.println("account blocked");
                    return;
                }
                System.out.println("password  mismatch\n you have "+--count+" attempt left");
            }
        }
    }
}