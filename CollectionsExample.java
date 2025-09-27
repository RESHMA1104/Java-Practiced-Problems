import java.util.*;
import java.util.ArrayList;
public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            list.add(i); // list.add(sc.nextInt());
        }
        System.out.println(list);
        for(int i=1; i<=n; i++){
            if(i%2==0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
