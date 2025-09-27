import java.util.Scanner;

public class PercentageFiveSubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Mark : ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Subject Mark : ");
        double b = sc.nextDouble();
        System.out.println("Enter Third Subject Mark : ");
        double c = sc.nextDouble();
        System.out.println("Enter Fourth Subject Mark : ");
        double d = sc.nextDouble();
        System.out.println("Enter Fifth Subject Mark : ");
        double e = sc.nextDouble();
        double totalMarks = a+b+c+d+e;
        double percentageMarks = (totalMarks / 500) * 100;
        System.out.printf("TotalMarks : %.2f%n", totalMarks);
        System.out.printf("Percentage of 5 Subjects is %.2f%%", percentageMarks);
    }
}
