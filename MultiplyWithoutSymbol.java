import java.util.*;
public class MultiplyWithoutSymbol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = 0;
        for(int i=0; i<num2; i++){
            num3 = num3+num1;
        }
        System.out.println(num3);
    }
}
