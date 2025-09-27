import java.util.Scanner;

public class CharacterVowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("The Character is a Vowel");
        }
        else{
            System.out.println("The Character is a Consonant");
        }
    }
}
