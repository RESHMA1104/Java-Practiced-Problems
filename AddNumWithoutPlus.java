import java.util.*;
public class AddNumWithoutPlus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for(int i=0; i<num2; i++){
            num1++;
        }
        System.out.println(num1);
    }
}