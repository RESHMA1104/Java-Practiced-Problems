import java.util.*;
class OTPGenerate{
    public static void main(String []args){
        Random ra=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mobile number to generate otp");
        int ph_no=sc.nextInt();
        if(ph_no==98765){
            System.out.println("OTP has sent ur mobile number");
            int num=ra.nextInt(9000)+1000;
            System.out.println(num);
            System.out.println("enter OTP to login:");
            int otp=sc.nextInt();
            if(otp==num){
                System.out.println("Login Successfully!!");
            }
            else{
                System.out.println("OTP miss match try again");
            }

        }
        else{
            System.out.println("Registered Phone number miss match and please try again one more time");
        }
    }
}