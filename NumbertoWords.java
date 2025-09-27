import java.util.*;
public class NumbertoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String once[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String tens[] = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String elevens[] = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String hundreds[] = {"", "hundreds", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        if(num > 10 && num < 20){
            System.out.println(elevens[num-10]);
            return;
        }
        else if(num>99 && num<999){
            int rem = num/10;
            System.out.println(once[num/100] + " hundred and " +tens[rem%10]+ " " +once[num%10]);
            return;
        }
        else if(num%10==0){
            System.out.println(tens[num/10]);
            return;
        }
        System.out.println(tens[num/10] + " " + once[num%10]);
    }
}