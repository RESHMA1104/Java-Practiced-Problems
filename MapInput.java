import java.util.*;
public class MapInput {
    public static void main(String[] args) {
        Map<Integer,String> mm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
         Scanner ss = new Scanner(System.in);
        System.out.println("Enter Student count : ");
        int n = sc.nextInt();
        System.out.println("Enter roll number and student name : ");
        for(int i=0; i<n; i++){
            int key = sc.nextInt();
        
            String value = ss.nextLine();
            mm.put(key, value);
        }
        System.out.println(mm);
    }
}