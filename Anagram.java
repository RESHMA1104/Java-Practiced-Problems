import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] str = new int[26];
        int[] strr = new int[26];
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != ' ')
            str[s1.charAt(i) - 'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            if(s2.charAt(i) != ' ')
            strr[s1.charAt(i) - 'a']++;
        }
        for(int i=0; i<26; i++){
            if(str[i] == strr[i]){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}