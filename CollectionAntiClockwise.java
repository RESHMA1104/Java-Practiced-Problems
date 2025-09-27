import java.util.*;
public class CollectionAntiClockwise {
    public static void main(String[]args){
        List<Integer> ar=new ArrayList<>();
        ar.add(10);ar.add(20);ar.add(30);ar.add(40);ar.add(50);
        System.out.println(ar);
        // int num=ar.get(0);
        // ar.remove(0);
        // ar.add(ar.size(),num);
        // System.out.println(ar);
        int n=2;
        for(int i=0;i<n;i++){
            int num=ar.get(ar.size()-1);
            ar.remove(ar.size()-1);
            ar.add(0,num);
        }
        System.out.println(ar);
    }
}