import java.util.*;
public class HelloPattern {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int len=str.length();
		  for (int i = 1; i < len - 1; i++) {
            System.out.print(str.charAt(i));
            for (int j = 1; j < len - 1; j++) {
                System.out.print(" ");
            }
			System.out.println(str.charAt(len-i-1));
		}
		for(int i=len-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}