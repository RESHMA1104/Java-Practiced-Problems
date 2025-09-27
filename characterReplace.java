import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  characterReplace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        if(s==null){
            System.out.println("null");
            return;
        }
        if(ch1 == ch2){
            System.out.println(s);
            return;
        }
        String result = "";
        boolean isfound = false;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ch1){
                result += ch2;
                isfound = true;
            }
            else if(c == ch2){
                result += ch1;
                isfound = true;
            }
            else{
                result += c;
            }
        }
        if(!isfound){
            System.out.println(s);
        }
        else{
            System.out.println(result);
        }
    }
}