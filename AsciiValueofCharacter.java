import java.util.Scanner;

public class AsciiValueofCharacter {
    public static void main(String[] args) { // 'A' - 65 , 'a' - 97, '0' - 48
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char Alphabets = sc.next().charAt(0);
        int value = (int)Alphabets; // Type casting char into int
        System.out.println("The ASCII Value of a Character "+Alphabets+ " is " +value);
    }
}