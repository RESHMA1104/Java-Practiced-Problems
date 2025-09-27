import java.util.*;
public class PersonNameintoAbbreviation {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Person's First Name : ");
        String s = sc.nextLine();
        System.out.println("Enter the Person's Second Name : ");
        String p = sc.nextLine();
        System.out.println("Enter the Person's Third Name : ");
        String q = sc.nextLine();
        char a = Character.toUpperCase(s.charAt(0)); // Character.toUpperCase ensures that char in uppercase and then take that index 0  to print abbreviation
        char b = Character.toUpperCase(p.charAt(0)); // p.charAt(0) picks the first letter at index 0
        char c = Character.toUpperCase(q.charAt(0));
        System.out.println("Abbreviation of Person's Name : " +a+"." +b+"."+c);
    }
}
