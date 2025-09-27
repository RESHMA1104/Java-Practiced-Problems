import java.util.Scanner;
public class GrossSalary { // basicSalary + HRA + DA = Gross Salary
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary : ");
        double basicSalary = sc.nextDouble();
        double HRA = 0.10 * basicSalary; // HRA 10% of basicSalary
        double DA = 0.08 * basicSalary; // DA 8% of basicSalary
        double GrossSalaryValue = basicSalary + HRA + DA;
        System.out.printf("Gross Salary of an employee : %.2f%n", GrossSalaryValue);
    }
}