import java.util.Scanner;
public class DateCorrectorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day : ");
        int Day = sc.nextInt();
        System.out.println("Enter Month : ");
        int Month = sc.nextInt();
        System.out.println("Enter Year : ");
        int Year = sc.nextInt();
        boolean isleap = false; // Store if a year is a leap year
        boolean isvalid = true; // Store if a date is valid
        int daysinMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0){ // Check if a year is a 
            isleap = true;
        }
        if(isleap && Month == 2){
            daysinMonth[1] = 29;
        }
        if(Month < 1 || Month > 12){
            isvalid = false;
        }
        else if(Day < 1 || Day > daysinMonth[Month - 1]){
            isvalid = false;
        }
        if(isvalid){
            System.out.println("The date is valid");
        }
        else{
            System.out.println("The date is not valid");
        }
    }
}