import java.util.Scanner;
public class CelsiusintoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius : ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (Celsius * 9 / 5) + 32; // F = 9/5 * Celsius + 32
        System.out.printf("%.2f Celsius = %.2f Fahrenheit",Celsius, Fahrenheit);
    }
}
